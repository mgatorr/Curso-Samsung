package patrones.visitor.visitador3;

public class ElementoB implements Elemento {
	private String tipo;

	public ElementoB() {

		this.setTipo("B");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void aceptar(Visitador3 v2) {
		v2.visitarElementoB(this);
	}

}
