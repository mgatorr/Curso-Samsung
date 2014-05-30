package patrones.state.conexionred;

public class Cerrado extends State {

	@Override
	public Estado getEstado() {

		return Estado.CERRADO;
	}

	@Override
	public void cerrar(ContextRed context) {

	}

	@Override
	public void abrir(ContextRed context) {
		context.setState(new Preparado());

	}
}
