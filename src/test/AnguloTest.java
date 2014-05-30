package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnguloTest {

	private int[] grados = { 0, -10, 10, 370, 730, -370 };
	private int[] grados2 = { 0, 350, 10, 10, 10, 350 };
	private int[] sumando = { 10, 10, -20, 730, -730 };
	private int[] suma = { 10, 0, 350, 20, 0 };

	@Test
	public void testAngulo() {
		Angulo ang = new Angulo();
		assertEquals(ang.getGrados(), 0);
	}

	@Test
	public void testAnguloInt() {
		for (int cont = 0; cont < grados.length; cont++) {
			Angulo ang = new Angulo(grados[cont]);
			assertEquals(ang.getGrados(), grados2[cont]);
		}
	}

	@Test
	public void testSuma() {
		for (int cont = 0; cont < sumando.length; cont++) {
			Angulo ang = new Angulo(grados[cont]);
			ang.suma(sumando[cont]);
			assertEquals(ang.getGrados(), suma[cont]);
		}
	}

}
