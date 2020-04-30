package main;

import java.util.List;

public class CalculadoraTarifaNormal extends CalculadoraDeTarifa {

	@Override
	public double comoCalcularTarifa(CDR cdr, Tarifa tarifa) {
		double costo = -1;
		if(!tarifa.esHoraValida(cdr.hora)) {
			costo = cdr.getDuracion() * tarifa.getTarifa();
		}
		return costo;
	}

}
