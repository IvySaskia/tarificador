package main;

import java.util.List;

public abstract class CalculadoraDeTarifa {

	public abstract double comoCalcularTarifa(CDR cdr, Tarifa tarifa);
	
	public double calcularCostoLlamada(CDR llamada, Tarifa tarifas){
		return comoCalcularTarifa(llamada, tarifas);
	}
}
