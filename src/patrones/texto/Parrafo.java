package patrones.texto;

public class Parrafo extends Compuesto {

	public Parrafo() {
	}

	@Override
	public void add(Componente componet) {
		if (componet.isComposite()) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else {
			this.getCompuesto().add(componet);
		}

	}

	@Override
	public void remove(Componente componet) {
		if (componet.isComposite()) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else {
			this.getCompuesto().remove(componet);
		}

	}

	@Override
	public String dibujar(boolean mayus) {
		String print = "";
		for (Componente caracteres : this.getCompuesto()) {
			print = "" + print + "" + caracteres.dibujar(mayus);
		}
		return print + "\n";
	}

}
