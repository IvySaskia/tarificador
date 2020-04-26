package main;

public class Postpago extends Plan{

private double tarifa;
	
	public Postpago() {}
	
	public Postpago(double tarifa) {
		this.tarifa = tarifa;
	}
	
	@Override
	public double calcularCostoLlamada(CDR cdr) {
		return tarifa;
	}
}
