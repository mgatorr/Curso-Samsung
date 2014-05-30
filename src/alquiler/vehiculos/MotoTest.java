package alquiler.vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotoTest {
	private Moto moto1;
	private Moto moto2;
	
	@Before
	public void ini(){
		moto1 = new Moto("M1254","Ducati");
		moto2 = new Moto("M1456");
	}

	@Test
	public void testPrecio() {
		assertEquals(105,moto1.precio(15),0.01);
		assertEquals(56,moto2.precio(7),0.01);
	}
	
	@Test
	public void testIdentificador(){
		assertEquals("Moto-M1254",moto1.getIdentificador());
		assertEquals("Moto-M1456",moto2.getIdentificador());
	}
	
	@Test
	public void testDescripcion(){
		assertEquals("Ducati",moto1.getDescripcion());
	}


}
