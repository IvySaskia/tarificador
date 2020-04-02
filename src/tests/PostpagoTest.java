package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Llamada;
import main.Postpago;

class PostpagoTest {
	Postpago plan = new Postpago(250.0);
	Postpago plan2 =new Postpago(400.0);
	Llamada llamada = new Llamada(70209102, 66666666, 2, 1830);
	Llamada llamada2 = new Llamada(76464241, 70999948, 10, 2130);

	
	@Test
	void calcularTarifaPostPago() {
		assertEquals(250, plan.calcularTarifa(llamada));
		assertEquals(400, plan2.calcularTarifa(llamada2));
		assertEquals(400, plan2.calcularTarifa(llamada));
		assertEquals(250, plan.calcularTarifa(llamada2));
	}
}