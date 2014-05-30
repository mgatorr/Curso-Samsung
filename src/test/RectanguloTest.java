package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {
	private int[] bases = { 1, 0, 0, -1, 1 };
	private int[] bases2 = { 1, 0, 0, 0, 1 };
	private int[] alturas2 = { 1, 1, 0, 1, 0 };
	private int[] alturas = { 1, 1, 0, 1, -1 };
	private double[] areas = { 1, 0, 0, 0, 0 };
	private double[] perimetros = { 4, 2, 0, 2, 2 };

	@Test
	public void testRectangulo() {
		Rectangulo rect = new Rectangulo();
		assertEquals(rect.getBase(), 0);
		assertEquals(rect.getAltura(), 0);
	}

	@Test
	public void testRectanguloIntInt() {
		for (int cont = 0; cont < bases.length; cont++) {
			Rectangulo rect = new Rectangulo(bases[cont], alturas[cont]);
			assertEquals(rect.getBase(), bases2[cont]);
			assertEquals(rect.getAltura(), alturas2[cont]);
		}
	}

	@Test
	public void testArea() {
		for (int cont = 0; cont < bases.length; cont++) {
			Rectangulo rect = new Rectangulo(bases[cont], alturas[cont]);
			assertEquals(rect.area(), areas[cont], 1);
		}

	}

	@Test
	public void testPerimetro() {
		for (int cont = 0; cont < bases.length; cont++) {
			Rectangulo rect = new Rectangulo(bases[cont], alturas[cont]);
			assertEquals(rect.perimetro(), perimetros[cont], 1);
		}
	}

}
