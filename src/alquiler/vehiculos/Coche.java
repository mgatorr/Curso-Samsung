package alquiler.vehiculos;

public class Coche extends Vehiculo {
	private CategoriaCoche categoria;

	public Coche(String identificador, CategoriaCoche categoria) {
		super("Coche-" + identificador);
		this.categoria = categoria;
	}

	public Coche(String identificador, String descripcion,
			CategoriaCoche categoria) {
		this(identificador, categoria);
		this.setDescripcion(descripcion);

	}

	public CategoriaCoche getCategoria() {
		return categoria;
	}

	@Override
	public double precio(int dias) {
		double coste = 0;
		assert dias > 0 : "Los dias de alquiler no puedes ser menores o iguales de 0";
		if (dias >= 1 && dias <= 3) {
			coste = dias * categoria.precio;
		} else if (dias >= 4 && dias <= 7) {

			coste = dias * (categoria.precio * 0.8);
		} else if (dias > 7) {
			coste = dias * (categoria.precio * 0.5);

		} else {
			assert false : "ERROR aqui no deberia de estar";
		}
		return coste;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
