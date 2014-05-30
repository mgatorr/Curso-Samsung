package prueba.asserts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CajaTest {
	private String prueba1 = "Hola";
	private String prueba2 = "Adios";

	@Test
	public void testAlmacenarLLena() {
		try {
			Caja<String> caja2 = new Caja<String>();

			caja2.almacenar(prueba2);
			caja2.almacenar(prueba2);

			fail("No a saltado la excepcion ERROR");

		} catch (RuntimeException e) {

		}

	}

	@Test
	public void testExtraerVacio() {
		try {
			Caja<String> caja1 = new Caja<String>();

			caja1.extraer();

			fail("No a saltado la excepcion ERROR");
		} catch (RuntimeException e) {

		}

	}

	@Test
	public void testAlmacenarExtraer() {
		Caja<String> caja2 = new Caja<String>();

		caja2.almacenar(prueba1);

		assertEquals(prueba1, (String) caja2.extraer());

	}

}
