package patrones.state.conexionred;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class ConexionTest {
	private ContextRed conexion;

	private EmisorMock emisor;

	@Before
	public void ini() {
		this.conexion = new ContextRed();
		this.emisor = new EmisorMock();
		// Se inyecta el emisor en la conexion
		this.conexion.setEmisor(emisor);
	}

	@Test
	public void testEstadoInicial() {
		assertEquals(Estado.CERRADO, this.conexion.estado());
	}

	@Test
	public void testCerradoCerrar() {
		this.conexion.cerrar();
		assertEquals(Estado.CERRADO, this.conexion.estado());
	}

	@Test
	public void testCerradoAbrir() {
		this.conexion.abrir();
		assertEquals(Estado.PREPARADO, this.conexion.estado());
	}

	@Test
	public void testCerradoNoSoportadoParar() {
		try {
			this.conexion.parar();
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testCerradoNoSoportadoIniciar() {
		try {
			this.conexion.iniciar();
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testCerradoNoSoportadoEnviar() {
		try {
			this.conexion.enviar("");
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testPreparadoCerrar() {
		this.conexion.abrir();
		this.conexion.cerrar();
		assertEquals(Estado.CERRADO, this.conexion.estado());
	}

	@Test
	public void testPreparadoAbrir() {
		this.conexion.abrir();
		this.conexion.abrir();
		assertEquals(Estado.PREPARADO, this.conexion.estado());
	}

	@Test
	public void testPreparadoParar() {
		this.conexion.abrir();
		this.conexion.parar();
		assertEquals(Estado.PARADO, this.conexion.estado());
	}

	@Test
	public void testPreparadoIniciar() {
		this.conexion.abrir();
		this.conexion.iniciar();
		assertEquals(Estado.PREPARADO, this.conexion.estado());
	}

	@Test
	public void testPreparadoEnviar() {
		this.conexion.abrir();
		this.conexion.enviar("...");
		assertEquals(Estado.PREPARADO, this.conexion.estado());
		assertEquals("...", emisor.getMsg());
	}

	@Test
	public void testParadoNoSoportadoCerrar() {
		this.conexion.abrir();
		this.conexion.parar();
		try {
			this.conexion.cerrar();
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testParadoNoSoportadoAbrir() {
		this.conexion.abrir();
		this.conexion.parar();
		try {
			this.conexion.abrir();
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testParadoParar() {
		this.conexion.abrir();
		this.conexion.parar();
		this.conexion.parar();
		assertEquals(Estado.PARADO, this.conexion.estado());
	}

	@Test
	public void testParadoIniciar() {
		this.conexion.abrir();
		this.conexion.parar();
		this.conexion.iniciar();
		assertEquals(Estado.PREPARADO, this.conexion.estado());
	}

	@Test
	public void testParadoNoSoportadoEnviar() {
		this.conexion.abrir();
		this.conexion.parar();
		try {
			this.conexion.enviar("");
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

}