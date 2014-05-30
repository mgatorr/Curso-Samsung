package expertos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComercialTest {
	private String[] dni = { "1234567D", "1234568A", "1234569S", "1234561D" };
	private int[] horas = { 10, 15, 18, 20, 24, 28, 4 };
	private double[] comisiones = { 1200, 1500, 3000, 500, 100, 200, 300 };

	@Test
	public void testSalario() {
		for (String dnis : dni) {
			for (int hora : horas) {
				for (double comision : comisiones) {
					Comercial emp1 = new Comercial(dnis, hora, comision);
					assertEquals(dnis, emp1.getDni());
					assertEquals(hora, emp1.getHoras());
					assertEquals(comision, emp1.getComision(), 0.001);
					assertEquals((hora * 8) + comision, emp1.salario(), 0.001);
				}
			}
		}
	}

	@Test
	public void testComercialString() {
		for (String dnis : dni) {
			Comercial emp1 = new Comercial(dnis);
			assertEquals(dnis, emp1.getDni());
		}
	}

	@Test
	public void testComercialStringIntDouble() {
		for (String dnis : dni) {
			for (int hora : horas) {
				for (double comision : comisiones) {
					Comercial emp1 = new Comercial(dnis, hora, comision);
					assertEquals(dnis, emp1.getDni());
					assertEquals(hora, emp1.getHoras());
					assertEquals(comision, emp1.getComision(), 0.001);
				}
			}
		}
	}

	@Test
	public void testSetComision() {
		Comercial emp1 = new Comercial(dni[1], horas[1], comisiones[1]);
		for (double comision : comisiones) {
			emp1.setComision(comision);
			assertEquals(comision, emp1.getComision(), 0.001);
		}
	}

}
