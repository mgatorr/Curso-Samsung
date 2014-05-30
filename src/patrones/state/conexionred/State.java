package patrones.state.conexionred;

public abstract class State {

	public abstract Estado getEstado();

	public void abrir(ContextRed context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public void cerrar(ContextRed context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public void parar(ContextRed context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public void iniciar(ContextRed context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public void enviar(ContextRed context, String mensaje) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
}
