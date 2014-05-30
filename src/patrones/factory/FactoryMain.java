package patrones.factory;

import upm.jbb.IO;

public class FactoryMain {
	private Creador[] creadores = { new Creador1(), new Creador2() };
	private Creador creador = creadores[0];

	public void tipoCreador() {
		this.creador = (Creador) IO.in.select(creadores, "Elige un creador");
	}

	public void crearProducto() {
		this.creador.crearProducto().view();
	}

	public static void main(String[] args) {
		IO.in.addController(new FactoryMain());
	}
}