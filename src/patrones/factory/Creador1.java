package patrones.factory;

public class Creador1 extends Creador {
	@Override
	public Producto crearProducto() {
		return new Producto1();
	}

	@Override
	public String toString() {
		return "Creador de Producto1";
	}
}