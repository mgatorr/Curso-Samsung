package patrones.state.conexionred;

public class ConexionSinPatron {
	private Estado estado;
	private Emisor emisor;

	public ConexionSinPatron() {
		this.estado = Estado.CERRADO;
	}

	public void setEmisor(Emisor emisor) {
		this.emisor = emisor;
	}

	public Estado estado() {
		return this.estado;
	}

	public void abrir() {
		if (this.estado == Estado.CERRADO) {
			this.estado = Estado.PREPARADO;
		} else if (this.estado == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PREPARADO) {
		} else
			assert false : "estado imposible";
	}

	public void cerrar() {
		if (this.estado == Estado.CERRADO) {
		} else if (this.estado == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PREPARADO) {
			this.estado = Estado.CERRADO;
		} else
			assert false : "estado imposible";
	}

	public void parar() {
		if (this.estado == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
		} else if (this.estado == Estado.PREPARADO) {
			this.estado = Estado.PARADO;
		} else
			assert false : "estado imposible";
	}

	public void iniciar() {
		if (this.estado == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
			this.estado = Estado.PREPARADO;
		} else if (this.estado == Estado.PREPARADO) {
		} else
			assert false : "estado imposible";
	}

	public void enviar(String msg) {
		if (this.estado == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PREPARADO) {
			this.emisor.enviar(msg);
		} else
			assert false : "estado imposible";
	}

}
