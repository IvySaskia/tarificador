package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.CDR;
import main.Wow;

class WowTest {

	List<Long> amigos = new ArrayList<Long>();	
	Wow plan = new Wow(0.99,amigos);
	Wow plan2 =new Wow(0.85,amigos);
	CDR llamada = new CDR(70209102, 66666666, 2, 1830);
	CDR llamada2 = new CDR(76464241, 70999948, 10, 2130);
	
	@Test
	void calcularTarifaWow() {
		amigos.add((long) 77777777);
		amigos.add((long) 70999948);
		assertEquals(1.98, plan.calcularTarifa(llamada));
		assertEquals(0, plan2.calcularTarifa(llamada2));
		assertEquals(1.70, plan2.calcularTarifa(llamada));
		assertEquals(0, plan.calcularTarifa(llamada2));
	}

}
