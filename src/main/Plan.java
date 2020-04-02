package main;

public abstract class Plan {
	
	double tarifa;

	Plan(){
		
	}
	
	Plan(double tarifa){
		this.tarifa = tarifa;
	}
	
	abstract double calcularTarifa(Llamada llamada);
}
