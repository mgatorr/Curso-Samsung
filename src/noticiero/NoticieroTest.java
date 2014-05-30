package noticiero;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NoticieroTest {
	// private List<Receptor> receptores = new ArrayList<Receptor>();
	private Noticiero not;
	private ReceptorMock mock;

	@Before
	public void ini() {
		not = new Noticiero();
		mock = new ReceptorMock();
	}

	@Test
	public void testRegistrar() {

		not.registrar(mock);
		assertEquals(1, not.getReceptores().size());
	}

	@Test
	public void testInformar() {
		not.registrar(mock);
		not.informar("Hola");
		assertEquals(mock.getTexto(), "Hola");

	}

}
