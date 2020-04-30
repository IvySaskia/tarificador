package main;

import java.util.List;

public class CalculadoraTarifaPorHora extends CalculadoraDeTarifa{

	@Override
	public double comoCalcularTarifa(CDR cdr, Tarifa tarifa) {
		double costo = -1;
		if(tarifa.getType() == "main.TarifaPorHora" && tarifa.esHoraValida(cdr.getHora())) {
			costo = cdr.getDuracion() * tarifa.getTarifa();
		}
		return costo;
	}

}
