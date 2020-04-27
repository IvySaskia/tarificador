package main;

public class Prepago extends Plan {
	
	private double tarifaNocturna;
	
	public Prepago(){
	}
	
	public Prepago(double tarifa, double tarifaNocturna){
		this.tarifa = tarifa;
		this.tarifaNocturna = tarifaNocturna;
	}
	
	@Override
	public double calcularTarifa(CDR llamada) {
		double costo = 0;
		
		if(isNightHour(llamada.getHora()))
			costo = this.tarifaNocturna * llamada.duracion;
		else 
			costo = this.tarifa * llamada.duracion;
		
		return costo;
		
	}
	
	public boolean isNightHour(int hora){
		return hora > 2100 && hora <= 2400;
	}

	public boolean isNormalHour(int hora) {
		return hora >= 0 && hora <= 2100;
	}
	
	public double getTarifaNocturna() {
		return tarifaNocturna;
	}

	public void setTarifaNocturna(double tarifaNocturna) {
		this.tarifaNocturna = tarifaNocturna;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

}
