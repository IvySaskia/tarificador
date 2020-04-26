package main;

import java.util.ArrayList;
import java.util.List;


public class Wow extends Plan{

	private List<Long> amigos = new ArrayList<Long>();
	
	public Wow() {}
	
	public Wow(double tarifa, List<Long> amigos) {
		this.tarifa = tarifa;
		this.amigos = amigos;
		
	}
	@Override
	public double calcularCostoLlamada(CDR cdr) {
		if(!amigos.isEmpty()) {
			if(amigos.contains(cdr.numeroDestino))
				return 0;
		}
		return tarifa;
	}

	public List<Long> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Long> amigos) {
		this.amigos = amigos;
	}
	
}
