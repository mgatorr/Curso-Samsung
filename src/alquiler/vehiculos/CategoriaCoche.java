package alquiler.vehiculos;

public enum CategoriaCoche {
	A(10), B(15), C(20);
	public final int precio;

	private CategoriaCoche(int precio) {
		this.precio = precio;
	}

}
