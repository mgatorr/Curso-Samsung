package patrones.compisite.arbol;

public class NodoHoja extends NodoComponente {
	private int numero;

	public NodoHoja(int numero) {

		this.numero = numero;
	}

	public int getNumero() {

		return numero;
	}

	@Override
	public void add(NodoComponente nodo) {

		throw new UnsupportedOperationException("Operación no soportada");

	}

	@Override
	public void remove(NodoComponente nodo) {
	}

	@Override
	public int numHijos() {

		return 0;
	}

	@Override
	public int suma() {

		return this.getNumero();
	}

	@Override
	public int mayor() {

		return this.getNumero();
	}

}
