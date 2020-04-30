package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CDR;
import main.Postpago;

class PostpagoTest {
	Postpago plan = new Postpago(250.0);
	Postpago plan2 =new Postpago(400.0);
	CDR llamada = new CDR(70209102, 66666666, 2, 1830);
	CDR llamada2 = new CDR(76464241, 70999948, 10, 2130);

	
	@Test
	void calcularTarifaPostPago() {
		assertEquals(250, plan.calculateCostCall(llamada));
		assertEquals(400, plan2.calculateCostCall(llamada2));
		assertEquals(400, plan2.calculateCostCall(llamada));
		assertEquals(250, plan.calculateCostCall(llamada2));
	}
}