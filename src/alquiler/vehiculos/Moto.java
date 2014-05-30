package alquiler.vehiculos;

public class Moto extends Vehiculo {

	public Moto(String identificador, String descripcion) {
		this(identificador);
		this.setDescripcion(descripcion);

	}

	public Moto(String identificador) {
		super("Moto-"+identificador);

	}

	@Override
	public double precio(int dias) {
		double coste = 0;
		assert dias > 0 : "Los dias de alquiler no puedes ser menores o iguales de 0";
		if (dias >=1 && dias <= 7) {
			coste = 8 * dias;
		} else if (dias > 7) {
			coste = 7 * dias;
		}else{
			assert false : "ERROR aqui no deberia de estar";
		}
		return coste;
	}

	@Override
	public String toString() {
		return  super.toString();
	}

}
