package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;

import org.junit.jupiter.api.Test;

import main.*;

class WowTest {

	List<Long> amigos = new ArrayList<Long>();	
	Tarifa tarifa = new TarifaPorHora(0.99, 830, 2100);
	Tarifa tarifa2 = new TarifaNormal(0.85);
	Wow plan = new Wow(asList(tarifa2, tarifa), amigos);
	Wow plan2 =new Wow(tarifa2, amigos);
	CDR llamada = new CDR(70209102, 66666666, 2, 900);
	CDR llamada2 = new CDR(76464241, 70999948, 10, 2030);
	CDR llamada3 = new CDR(76464241, 70999941, 10, 2030);
	
	@Test
	void calcularTarifaWow() {
		amigos.add((long) 77777777);
		amigos.add((long) 70999948);
		assertEquals(1.98, plan.calcularCostoLlamada(llamada));
		assertEquals(0, plan2.calcularCostoLlamada(llamada2));
		assertEquals(1.70, plan2.calcularCostoLlamada(llamada));
		assertEquals(0, plan.calcularCostoLlamada(llamada2));
		assertEquals(9.9, plan.calcularCostoLlamada(llamada3));
	}
	
	@Test
	void devolucionCase() {
		System.out.println(tarifa.getType());
		if(tarifa.getType() == "main.TarifaPorHora") {
			System.out.println("duracion * tarifaporhora");
		}
		if(tarifa2.getType() == "main.TarifaNormal") {
			System.out.println("duracion * tarifa");
		}
		System.out.println(tarifa.esHoraValida(1200));
		System.out.println(tarifa2.esHoraValida(1200));
		assertEquals(1,1);
	}

}
