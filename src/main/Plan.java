package main;

import java.util.*;

public abstract class Plan{
	
	List<Tarifa> tarifas = new ArrayList<>();

	public List<Tarifa> getTarifas() {
		return tarifas;
	}

	public void setTarifas(List<Tarifa> tarifas) {
		this.tarifas = tarifas;
	}
	
	public void addTarifa(Tarifa tarifa) {
		tarifas.add(tarifa);
	}

	Plan(){
		
	}
	
	Plan(Tarifa tarifa){
		addTarifa(tarifa);
	}

	abstract double calcularCostoLlamada(CDR cdr);
}
