package alquiler.vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorVehiculosTest {
	private GestorVehiculos gv;
	private Vehiculo vh1;
	private Vehiculo vh2;

	@Before
	public void ini() {
		vh1 = new Coche("M1234", "Ford", CategoriaCoche.A);
		vh2 = new Moto("M1234", "Ducati");

	}

	@Test
	public void testAñadirVehiculo() {
		gv.añadirVehiculo(vh1);
		assertEquals(true, gv.comprobarVehiculo(vh1));
	}

	@Test
	public void testDarPrecio() {
		gv.añadirVehiculo(vh1);
		assertEquals(10, gv.darPrecio("M1234", 1), 0.01);
	}

	@Test
	public void testToString() {
		gv.añadirVehiculo(vh1);
		gv.añadirVehiculo(vh2);
		System.out.println("" + gv.toString());
	}

}
