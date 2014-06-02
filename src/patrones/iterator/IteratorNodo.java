package patrones.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorNodo implements Iterator<Nodo> {
	private Nodo actual;

	public IteratorNodo(Nodo actual) {
		this.actual = actual;
	}

	@Override
	public boolean hasNext() {
		return this.actual != null;
	}

	@Override
	public Nodo next() {
		if (!this.hasNext()) {
			throw new NoSuchElementException();
		}
		Nodo ant = this.actual;
		this.actual = this.actual.getSiguiente();
		return ant;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}