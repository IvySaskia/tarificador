package main;

public class Wow extends Plan{

	public Wow() {}
	
	public Wow(double tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public double calcularTarifa(Llamada llamada) {
		return tarifa;
	}
	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
}
