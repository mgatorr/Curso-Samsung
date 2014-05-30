package alquiler.vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BiciTest {
	private Bici bici1;
	private Bici bici2;
	
	@Before
	public void ini (){
		bici1 = new Bici("0001","Trenk");
		bici2 = new Bici("0002");
	}

	@Test
	public void testPrecio() {
		assertEquals(3,bici1.precio(1),0.01);
		assertEquals(20,bici2.precio(10),0.01);
	}

}
