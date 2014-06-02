package patrones.iterator;

import java.util.Iterator;

public class Nodo implements Iterable<Nodo> {
	private int valor;

	private Nodo siguiente;

	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
	}

	public boolean isUltimo() {
		return this.siguiente == null;
	}

	public int getValor() {
		return this.valor;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void insertar(Nodo subNodo) {
		Nodo anterior = this.siguiente;
		this.siguiente = subNodo;
		subNodo.siguiente = anterior;
	}

	@Override
	public Iterator<Nodo> iterator() {
		return new IteratorNodo(this);
	}

}