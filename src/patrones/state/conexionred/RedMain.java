package patrones.state.conexionred;

import upm.jbb.IO;

public class RedMain {
	private ContextRed connection = new ContextRed();

	public RedMain() {
		this.connection.setEmisor(new EmisorMock());
	}

	public void abrir() {
		this.connection.abrir();
	}

	public void parar() {
		this.connection.parar();
	}

	public void iniciar() {
		this.connection.iniciar();
	}

	public void enviar() {
		this.connection.enviar(IO.in.readString("Mensaje"));
	}

	public void cerrar() {
		this.connection.cerrar();
	}

	public static void main(String[] args) {
		IO.in.addController(new RedMain());
	}

}
