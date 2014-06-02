package patrones.visitor.visitador3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class Visitador3Test {
	private Collection<Elemento> coleccion = new ArrayList<Elemento>();

	@Before
	public void ini() {
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoB());
		coleccion.add(new ElementoB());
		coleccion.add(new ElementoB());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoB());
	}

	@Test
	public void testVisitorAs() {
		Visitador3 v2 = new Visitador3();
		for (Elemento elemento : coleccion) {
			elemento.aceptar(v2);
		}
		assertEquals(2, v2.getAs());
	}

	@Test
	public void testVisitorBs() {
		Visitador3 v2 = new Visitador3();
		for (Elemento elemento : coleccion) {
			elemento.aceptar(v2);
		}
		assertEquals(3, v2.getBs());
	}

}