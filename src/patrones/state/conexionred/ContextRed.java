package patrones.state.conexionred;

public class ContextRed {

	private State state;
	private Emisor emisor;

	public ContextRed() {
		this.state = new Cerrado();
	}

	public void setEmisor(Emisor emisor) {
		this.emisor = emisor;
	}

	protected void setState(State state) {
		this.state = state;
	}

	public Emisor getEmisor() {
		return emisor;
	}

	public Estado estado() {
		return state.getEstado();
	}

	public void abrir() {
		this.state.abrir(this);

	}

	public void cerrar() {
		this.state.cerrar(this);

	}

	public void parar() {
		this.state.parar(this);
	}

	public void iniciar() {
		this.state.iniciar(this);
	}

	public void enviar(String mensaje) {
		this.state.enviar(this, mensaje);

	}

}