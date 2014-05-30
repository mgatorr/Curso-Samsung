package alquiler.vehiculos;

public abstract class Vehiculo {

	private String identificador;
	private String descripcion;

	public Vehiculo(String identificador, String descripcion) {

		this(identificador);
		this.setDescripcion(descripcion);
	}

	public Vehiculo(String identificador) {

		this.setIdentificador(identificador);
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public abstract double precio(int dias);

	@Override
	public String toString() {
		return "Vehiculo [identificador=" + identificador + ", descripcion="
				+ descripcion + "]";
	}


}
