package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.Llamada;
import main.Wow;

class WowTest {

	List<Long> amigos = new ArrayList<Long>();	
	Wow plan = new Wow(250.0,amigos);
	Wow plan2 =new Wow(400.0,amigos);
	Llamada llamada = new Llamada(70209102, 66666666, 2, 1830);
	Llamada llamada2 = new Llamada(76464241, 70999948, 10, 2130);
	
	@Test
	void calcularTarifaWow() {
		amigos.add((long) 77777777);
		amigos.add((long) 70999948);
		assertEquals(250, plan.calcularTarifa(llamada));
		assertEquals(0, plan2.calcularTarifa(llamada2));
		assertEquals(400, plan2.calcularTarifa(llamada));
		assertEquals(0, plan.calcularTarifa(llamada2));
	}

}
