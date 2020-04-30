package main;

public class TarifaNormal extends Tarifa {
	
	public TarifaNormal(double tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public double calcularCostoLlamada(CDR llamada) {
		return llamada.getDuracion() * this.tarifa;
	}

	public boolean esHoraValida(int hour) {
		return false;
	}

	@Override
	public String getType() {
		return this.getClass().getName();
	}
	 
	public CalculadoraDeTarifa crearCalculadora() {
		return new CalculadoraTarifaNormal();
	}
}
