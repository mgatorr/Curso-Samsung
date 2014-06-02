package patrones.visitor.visitante2;

public class ElementoA implements Elemento {
	private String tipo;

	public ElementoA() {
		this.setTipo("A");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void aceptar(Visitador2 v2) {
		v2.visitarElementoA(this);
	}
}
