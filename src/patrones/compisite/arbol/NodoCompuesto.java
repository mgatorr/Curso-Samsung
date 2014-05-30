package patrones.compisite.arbol;

import java.util.ArrayList;
import java.util.List;

public class NodoCompuesto extends NodoComponente {

	private String name;
	private List<NodoComponente> lista;

	public NodoCompuesto(String name) {
		this.name = name;
		this.lista = new ArrayList<NodoComponente>();
	}

	public String getName() {
		return name;
	}

	@Override
	public void add(NodoComponente nodo) {
		if (nodo == null) {

		} else {
			lista.add(nodo);
		}

	}

	@Override
	public void remove(NodoComponente nodo) {
		if (nodo == null) {

		} else {
			lista.remove(nodo);
		}

	}

	@Override
	public boolean esCompuesto() {
		return true;
	}

	public int numHijos() {
		return lista.size();
	}

	public int suma() {
		int suma = 0;
		for (NodoComponente nodo : this.lista) {
			suma = suma + nodo.suma();
		}
		return suma;
	}

	public int mayor() {
		int mayor = Integer.MIN_VALUE;
		for (NodoComponente nodo : this.lista) {
			if (mayor <= nodo.mayor()) {
				mayor = nodo.mayor();
			}
		}
		return mayor;
	}

}
