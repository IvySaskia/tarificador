package tests;

import static org.junit.Assert.*;
import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.IOException;
import java.util.Date;

import org.junit.*;
import org.junit.jupiter.api.Test;

import main.*;

public class RegistroTest {

	private CDRRegistry reg = new CDRRegistry();
	private Plan prepago = new Prepaid(1.45);
	private Plan postpago = new Postpaid(1);
	private Plan wow = new Wow(0.99);
	private CDR llamada = new CDR(7777777, 6666666, 2, 1830, new Date());
	private CDR llamada2 = new CDR(6666666, 7777777, 2, 2130, new Date());
	private CDR llamada3 = new CDR(8888888, 7777777, 12, 1534, new Date());
	private CDR llamada4 = new CDR(8888888, 6666666, 34, 1845, new Date());
	private CDR llamada5 = new CDR(8888888, 6666665, 34, 1925, new Date());
	private ClientRegistry reg2 = new ClientRegistry();
	private Client cliente = new Client(prepago, 7777777);
	private Client cliente2 = new Client(postpago, 6666666);
	private Client cliente3 = new Client(wow, 8888888);
	
	@Test
	public void testAddingCalls() throws IOException {
		reg2.addClient(cliente);
		reg2.addClient(cliente2);
		reg2.addClient(cliente3);
		reg.addCDR(llamada, reg2);
		reg.addCDR(llamada2, reg2);
		reg.addCDR(llamada3, reg2);
		reg.addCDR(llamada4, reg2);
		reg.addCDR(llamada5, reg2);
		reg.saveRegistry();
		assertThat(reg.getRegistry(), is(asList(llamada, llamada2, llamada3, llamada4, llamada5)));
	}
	
	@Test
	void initializeTest() {
		CDRRegistry CDRregister = new CDRRegistry();
		CDRregister.setRegistry(asList(llamada, llamada2, llamada3, llamada4));
		assertThat(CDRregister.getRegistry(), is(asList(llamada, llamada2, llamada3, llamada4)));
	}

}
