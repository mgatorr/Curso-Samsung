package patrones.texto;

public class Texto extends Compuesto {

	public Texto() {
	}

	@Override
	public void add(Componente componet) {
		if (componet.isComposite()) {
			this.getCompuesto().add(componet);
		} else {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}

	}

	@Override
	public void remove(Componente componet) {
		if (componet.isComposite()) {
			this.getCompuesto().remove(componet);
		} else {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}

	@Override
	public String dibujar(boolean mayus) {
		String print = "";
		for (Componente caracteres : this.getCompuesto()) {
			print = "" + print + "" + caracteres.dibujar(mayus);
		}
		return print + "---o---\n";
	}
}
