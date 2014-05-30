package alquiler.vehiculos;

public class Bici extends Vehiculo {

	public Bici(String identificador, String descripcion) {
		this(identificador);
		this.setDescripcion(descripcion);

	}

	public Bici(String identificador) {
		super("Bici-" + identificador);

	}

	@Override
	public double precio(int dias) {
		double coste = 0;
		assert dias > 0 : "Los dias de alquiler no puedes ser menores o iguales de 0";
		if (dias >= 1 && dias <= 2) {
			coste = dias * 3;
		} else if(dias > 2) {
			coste = dias * 2;
		}else{
			assert false : "ERROR aqui no deberia de estar";
		}
		return coste;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
