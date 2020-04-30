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

	public void setRegistry(List<CDR> registry) {
		this.registry = registry;
	}
	
	public void saveRegistry() throws IOException {
		
	    File file = new File("CDRregister.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Origen, Destino, Duracion, Hora, Fecha, Costo");
        bw.newLine();
        
        for(CDR cdr: this.registry) {
        	System.out.println(cdr.join());
        	bw.write(cdr.join());
        	bw.newLine();
        }
        bw.close();
        fw.close();
	}
	
}
