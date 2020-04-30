package main;

public abstract class Tarifa {
	
	protected double tarifa;
	
	public Tarifa(){
	}
	
	public Tarifa(double tarifa){
		this.tarifa = tarifa;
	}
	
	public double getTarifa() {
		return this.tarifa;
	}
	public abstract String getType();

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}
	
	public abstract CalculadoraDeTarifa crearCalculadora();
	
	public abstract boolean esHoraValida(int hour);
	
	public abstract double calcularCostoLlamada(CDR llamada);
}
