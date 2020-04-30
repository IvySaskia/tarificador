package main;

import java.util.List;

public class Prepago extends Plan {
	
	private double tarifaNocturna;
	
	public Prepago(){
	}
	
	public Prepago(Tarifa tarifa){
		addTarifa(tarifa);
	}
	
	public Prepago(List<Tarifa> tarifas){
		setTarifas(tarifas);
	}
	
	@Override
	public double calcularCostoLlamada(CDR llamada) {
		double costo = 0;
		for(Tarifa tarifa: tarifas) {
			CalculadoraDeTarifa calculadoraTarifa = tarifa.crearCalculadora();
			costo = calculadoraTarifa.calcularCostoLlamada(llamada, tarifa);
			if(costo != -1) {
				return costo;
			}
		}
		return costo;
	}
}
