package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import main.*;

class PrepagoTest {

	Prepaid plan;
	CDR llamada = new CDR(7777777, 66666666, 2, 1830, new Date());
	CDR llamada2 = new CDR(7777777, 66666666, 2, 2130, new Date());
	Fare fare = new NormalFare(2);
	
	@Test
	void testFirstConstructor() {
		Prepaid plan = new Prepaid(1.45);
		assertEquals(plan.getNormalFare().getFare(), 1.45);
	}

	@Test
	void testSecondConstructor() {
		Prepaid plan = new Prepaid(new NormalFare(1.2));
		assertEquals(plan.getNormalFare().getFare(), 1.2);
	}
	
	@Test
	void testThirdConstructor() {
		Prepaid plan = new Prepaid(fare);
		assertEquals(plan.getNormalFare().getFare(), 2);
	}
}
