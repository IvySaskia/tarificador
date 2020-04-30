package main;

public class Postpago extends Plan{

private double rate;
	
	public Postpago() {}
	
	public Postpago(double rate) {
		this.rate = rate;
	}
	
	@Override
	public double calcularCostoLlamada(CDR cdr) {
		return rate * cdr.getDuration();
	}
}
