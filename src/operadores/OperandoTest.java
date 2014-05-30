package operadores;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperandoTest {
	private Calculadora[] calculos = { new Suma(12, 15.5, "suma1"),
			new Resta(15.6, 18.9, "Resta1") };

	@Test
	public void testTotal() {
		Operando opera = new Operando();

		assertEquals(24.2, opera.total(calculos), 0.001);

	}

}
