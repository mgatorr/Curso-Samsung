package patrones.state.conexionred;

public class Parado extends State {

	@Override
	public Estado getEstado() {

		return Estado.PARADO;
	}

	@Override
	public void parar(ContextRed context) {

	}

	@Override
	public void iniciar(ContextRed context) {
		context.setState(new Preparado());
	}

}
