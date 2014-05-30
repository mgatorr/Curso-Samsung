package alquiler.vehiculos;

import java.util.HashMap;
import java.util.Map;

public class GestorVehiculos {
	private Map<String, Vehiculo> almacenVehiculos;

	public GestorVehiculos() {
		almacenVehiculos = new HashMap<>();

	}

	public void añadirVehiculo(Vehiculo vehiculo) {

	}

	protected boolean comprobarVehiculo(Vehiculo vehiculo) {
		
		return false;

	}

	public double darPrecio(String indentificador, int dias) {
		return 0;

	}

	@Override
	public String toString() {
		return "GestorVehiculos [almacenVehiculos=" + almacenVehiculos.toString() + "]";
	}

}
