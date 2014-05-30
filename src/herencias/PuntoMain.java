package herencias;

import upm.jbb.IO;

public class PuntoMain {

	public static void main(String[] args) {
		IO.in.addController(new PuntoMain());

	}

	public void puntoPunto3D() {
		Punto p = new Punto3D(1, 2, 3, 0);
		System.out.println("Modulo = " + p.modulo());

	}

	public void puntoPuntoTiempo() {
		int value = IO.in.readInt("Introducir valores de tiempo");
		Punto pt = new PuntoTiempo(1, 2, value);
		System.out.println("Velocidad = " + ((PuntoTiempo)pt).velocidad());
	}
	

}
