package tests;

import static org.junit.Assert.*;
import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.IOException;

import org.junit.*;
import org.junit.jupiter.api.Test;

import main.*;

public class RegistroTest {

	private RegistroCDR reg = new RegistroCDR();
	private Plan prepago = new Prepago(1.45, 0.7);
	private Plan postpago = new Postpago(1);
	private Plan wow = new Wow(0.99, asList((long)7777777, (long)6666666));
	private CDR llamada = new CDR(7777777, 6666666, 2, 1830);
	private CDR llamada2 = new CDR(6666666, 7777777, 2, 2130);
	private CDR llamada3 = new CDR(8888888, 7777777, 12, 1534);
	private CDR llamada4 = new CDR(8888888, 6666666, 34, 1845);
	private CDR llamada5 = new CDR(8888888, 6666665, 34, 1925);
	private RegistroClientes reg2 = new RegistroClientes();
	private Cliente cliente = new Cliente(prepago, 7777777);
	private Cliente cliente2 = new Cliente(postpago, 6666666);
	private Cliente cliente3 = new Cliente(wow, 8888888);
	
	@Test
	public void test() throws IOException {
		reg2.anadirCliente(cliente);
		reg2.anadirCliente(cliente2);
		reg2.anadirCliente(cliente3);
		reg.anadirCDR(llamada, reg2);
		reg.anadirCDR(llamada2, reg2);
		reg.anadirCDR(llamada3, reg2);
		reg.anadirCDR(llamada4, reg2);
		reg.anadirCDR(llamada5, reg2);
		reg.guardarRegistro();
		assertThat(reg.getRegistro(), is(asList(llamada, llamada2, llamada3, llamada4, llamada5)));
	}

}
