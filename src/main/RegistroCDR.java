package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegistroCDR {

	List<CDR> registro = new ArrayList<>();
	
	public void anadirCDR(CDR cdr, ClientRegistration listaClientes) {
		cdr.calculateCostCall(listaClientes);
		this.registro.add(cdr);
		
	}
	
	public List<CDR> getRegistro() {
		return registro;
	}

	public void setRegistro(List<CDR> registro) {
		this.registro = registro;
	}
	
	public void guardarRegistro() throws IOException {
		
	    File file = new File("/Users/miguelalejandrojordan/Documents/register.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Origen, Destino, Duracion, Hora, Costo");
        bw.newLine();
        
        for(CDR cdr: registro) {
        	bw.write(cdr.join());
        	bw.newLine();
        }
        bw.close();
        fw.close();
	}
	
}
