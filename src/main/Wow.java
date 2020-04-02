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
	public double calcularTarifa(Llamada llamada) {
		if(!amigos.isEmpty()) {
			if(amigos.contains(llamada.numeroDestino))
				return 0;
		}
		return tarifa;
	}
	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public List<Long> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Long> amigos) {
		this.amigos = amigos;
	}
	
}
