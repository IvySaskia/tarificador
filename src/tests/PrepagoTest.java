package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Llamada;
import main.Prepago;

class PrepagoTest {

	Prepago plan = new Prepago(1.45, 0.7);
	Llamada llamada = new Llamada(7777777, 66666666, 2, 1830);
	Llamada llamada2 = new Llamada(7777777, 66666666, 2, 2130);
	
	@Test
	void isNightHourTrue() {
		assertEquals(true, plan.isNightHour(2359));
	}
	
	@Test
	void isNightHourFalse() {
		assertEquals(false, plan.isNightHour(0030));
	}
	
	@Test
	void isNormalHourTrue() {
		assertEquals(true, plan.isNormalHour(1859));
	}
	
	@Test
	void isNormalHourFalse() {
		assertEquals(false, plan.isNormalHour(2101));
	}

	@Test
	void calcularTarifaNormal() {
		assertEquals(2.9, plan.calcularTarifa(llamada));
	}
	
	@Test
	void calcularTarifaNocturna() {
		assertEquals(1.4, plan.calcularTarifa(llamada2));
	}
	
	@Test 
	void obtenerTarifaNormal() {
		assertEquals(1.45, plan.getTarifa());
	}
	
	@Test 
	void obtenerTarifaNocturna() {
		assertEquals(0.7, plan.getTarifaNocturna());
	}
}
