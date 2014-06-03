package patrones.texto;

public class Caracter extends Componente {
	private char letra;

	public Caracter(char letra) {
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	private String forzarMayus() {

		return Character.toString(getLetra()).toUpperCase();
	}

	@Override
	public String dibujar(boolean mayus) {
		String dibujo = null;
		if (mayus) {
			dibujo = this.forzarMayus();
		} else {
			dibujo = Character.toString(getLetra());
		}
		return dibujo;
	}

	@Override
	public void add(Componente componet) {
	}

	@Override
	public void remove(Componente componet) {
	}

	@Override
	public boolean isComposite() {
		return false;
	}

}
