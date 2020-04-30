package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import main.*;

class PostpagoTest {
	
	Postpaid plan = new Postpaid(1.3);
	Postpaid plan2 = new Postpaid(1.5);
	
	CDR llamada = new CDR(70209102, 66666666, 2, 1830, new Date());
	CDR llamada2 = new CDR(76464241, 70999948, 10, 2130, new Date());

}