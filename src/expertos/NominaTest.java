package expertos;

import static org.junit.Assert.*;

import org.junit.Test;

public class NominaTest {
	private Empleado[] empleados = { new Administrador("123467D", 80),
			new Comercial("123456E", 60, 1500) };

	@Test
	public void testTotalNominas() {
		Nomina nomin = new Nomina();
		assertEquals(2780, nomin.totalNominas(empleados), 0.01);

	}

}
