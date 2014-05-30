package patrones.compisite.arbol;

public abstract class NodoComponente {

	public abstract void add(NodoComponente nodo);

	public abstract void remove(NodoComponente nodo);

	public boolean esCompuesto() {
		return false;
	}

	public abstract int numHijos();

	public abstract int suma();

	public abstract int mayor();

}
