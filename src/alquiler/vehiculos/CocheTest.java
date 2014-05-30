package alquiler.vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CocheTest {
	private Coche coche1;
	private Coche coche2;
	private Coche coche3;

	@Before
	public void ini() {
		coche1 = new Coche("M1234", CategoriaCoche.A);
		coche2 = new Coche("M1235", CategoriaCoche.B);
		coche3 = new Coche("M1236", CategoriaCoche.C);

	}

	@Test
	public void testPrecio() {
		assertEquals(30, coche1.precio(3),0.01);
		assertEquals(72, coche2.precio(6),0.01);
		assertEquals(100, coche3.precio(10),0.01);

	}

	@Test
	public void testIdentificador() {
		assertEquals("Coche-M1234", coche1.getIdentificador());
		assertEquals("Coche-M1235", coche2.getIdentificador());
		assertEquals("Coche-M1236", coche3.getIdentificador());
	}

}
