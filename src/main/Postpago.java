package main;

public class Postpago extends Plan{

private double tarifa;
	
	public Postpago() {}
	
	public Postpago(double tarifa) {
		this.tarifa = tarifa;
	}
	
	@Override
	public double calcularTarifa(CDR llamada) {
		return tarifa * llamada.getDuracion();
	}

	public double getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
}
