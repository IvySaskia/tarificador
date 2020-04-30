package main;

import java.util.ArrayList;
import java.util.List;


public class Wow extends Plan{

	private List<Long> amigos = new ArrayList<Long>();
	
	public Wow() {}
	
	public Wow(Tarifa tarifa, List<Long> amigos) {
		addTarifa(tarifa);
		this.amigos = amigos;
	}
	
	public Wow(List<Tarifa> tarifas, List<Long> amigos) {
		setTarifas(tarifas);
		this.amigos = amigos;
	}
	@Override
	public double calcularCostoLlamada(CDR cdr) {
		double costo = -1;
		
		if(amigos.contains(cdr.numeroDestino))
			costo = 0;
		else {
			for(Tarifa tarifa: tarifas) {
				CalculadoraDeTarifa calculadoraTarifa = tarifa.crearCalculadora();
				costo = calculadoraTarifa.calcularCostoLlamada(cdr, tarifa);
			}
			
		}
		return costo;
	}

	public List<Long> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Long> amigos) {
		this.amigos = amigos;
	}
	
}
