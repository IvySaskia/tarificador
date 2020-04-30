package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import main.CDR;

class CDRTest {

	CDR cdr = new CDR();
//	CDR cdr2 = new CDR(7777777, 6666666, 2, 1830, new Date(30-04-2020));

	@Test
	void isSameOriginPhoneNumberTest() {
		cdr.setOriginPhoneNumbern(7777777);
		assertEquals(7777777, cdr.getOriginPhoneNumber());
	}

}
