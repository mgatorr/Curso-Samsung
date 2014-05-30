package prueba.asserts;

public class Caja<T> {
	private T almacen;

	public Caja() {

	}

	public void almacenar(T obj) {
		assert obj != null : "El objeto a almacenar no puede ser nulo";
		if (this.almacen != null) {
			throw new RuntimeException("El almacen esta lleno");
		} else {
			almacen = obj;
		}

	}

	public Object extraer() {
		if (this.almacen == null) {
			throw new RuntimeException("El almacen esta vacio");
		}

		return this.almacen;
	}

}
