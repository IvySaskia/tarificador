package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CDRRegistry {

	List<CDR> registry = new ArrayList<>();
	
	public void addCDR(CDR cdr, ClientRegistry clientsList) {
		cdr.calculateCostCall(clientsList);
		this.registry.add(cdr);
	}
	
	public List<CDR> getRegistry() {
		return registry;
	}
	
	private List<CDR> calculateCDRListCost(List<CDR> CDRList, ClientRegistry clientsList) {
		for( CDR cdr : CDRList) {
			cdr.calculateCostCall(clientsList);
		}
		return CDRList;
	}

	public void setRegistry(List<CDR> registry,  ClientRegistry clientsList) {
		this.registry = this.calculateCDRListCost(registry, clientsList);
	}
	
	public void saveRegistry() throws IOException {
		
	    File file = new File("CDRregister.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Origen, Destino, Duracion, Hora, Fecha, Costo");
        bw.newLine();
        
        for(CDR cdr: this.registry) {
        	bw.write(cdr.join());
        	bw.newLine();
        }
        bw.close();
        fw.close();
	}
	
}
