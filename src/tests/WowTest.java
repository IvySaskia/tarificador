package tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.*;

class WowTest {

	Fare normalFare = new NormalFare(0.85);
	Fare normalFare2 = new NormalFare(0.99);
	Fare fareByHour = new FareByHour(0.70, 2100, 2359);
	Wow plan = new Wow(0.99);
	Wow plan2 = new Wow(normalFare);
	Wow plan3 = new Wow(normalFare ,asList(fareByHour));
	CDR llamada = new CDR(70209102, 66666666, 2, 1830, new Date(25-04-2020));
	CDR llamada2 = new CDR(76464241, 70999948, 10, 2130, new Date(25-04-2020));
	
	@Test
	void testFirstConstructor() {
		List<Fare> fareList = plan.getFareList();
		assertEquals(0.99, plan.getNormalFare().getFare(), 0.99);
	}
	
	@Test
	void testSecondConstructor() {
		List<Fare> fareList = plan2.getFareList();
		assertEquals(normalFare, plan2.getNormalFare());
	}
	
	@Test
	void testThirdConstructor() {
		List<Fare> fareList = plan3.getFareList();
		assertThat(fareList, is(asList(fareByHour)));
	}
	
	@Test
	void testAddFriend() {
		plan.addFriend(70999948);
		assertThat(plan.getFriends(), is(asList((long)70999948)));
	}
	
	@Test
	void testRemoveFriend() {
		plan.addFriend(66666666);
		plan.addFriend(70999948);
		plan.removeFriend(70999948);
		assertThat(plan.getFriends(), is(asList((long)66666666)));
	}
	
	@Test
	void testSetFriendsList() {
		plan.setFriends(asList((long)70999948, (long)70209102));
		assertThat(plan.getFriends(), is(asList((long)70999948, (long)70209102)));
	}
	
//	@Test
//	void calcularTarifaWow() {
//		amigos.add((long) 77777777);
//		amigos.add((long) 70999948);
//		assertEquals(1.98, plan.calcularTarifa(llamada));
//		assertEquals(0, plan2.calcularTarifa(llamada2));
//		assertEquals(1.70, plan2.calcularTarifa(llamada));
//		assertEquals(0, plan.calcularTarifa(llamada2));
//	}

}
