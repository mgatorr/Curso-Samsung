package patrones.factory.numeros;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroTest {
	private CreadorNumero creadorEn = new CreadorNumeroEn();
	private CreadorNumero creadorEs = new CreadorNumeroEs();

	@Test
	public void testIsNew() {
		Numero num = creadorEn.createNumero();
		assertNotSame(creadorEn.createNumero(), num);
	}

	@Test
	public void testConvertir() {
		assertEquals("0 a ES", "cero",
				this.creadorEs.createNumero().convertir(0).toLowerCase());
		assertEquals("5 a EN", "five",
				this.creadorEn.createNumero().convertir(5).toLowerCase());
	}
}