package patrones.state.conexionred;

public class Preparado extends State {

	@Override
	public Estado getEstado() {

		return Estado.PREPARADO;
	}

	@Override
	public void abrir(ContextRed context) {

	}

	@Override
	public void cerrar(ContextRed context) {
		context.setState(new Cerrado());
	}

	@Override
	public void parar(ContextRed context) {
		context.setState(new Parado());
	}

	@Override
	public void iniciar(ContextRed context) {
		
	}

	@Override
	public void enviar(ContextRed context, String mensaje) {
		context.getEmisor().enviar(mensaje);
	}



}
