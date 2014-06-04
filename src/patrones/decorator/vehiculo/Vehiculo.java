package patrones.decorator.vehiculo;

public abstract class Vehiculo {
	private String descripcion;
	private int precio;

	public Vehiculo(int precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public abstract String descripcion();

	public abstract int precio();

}
