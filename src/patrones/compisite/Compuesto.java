package patrones.compisite;

import upm.jbb.IO;

public class Compuesto extends Componente {
	private java.util.List<Componente> lista;

	public Compuesto(String nombre) {
		super(nombre);
		this.lista = new java.util.ArrayList<Componente>();
	}

	@Override
	public void view(String cabecera) {
		IO.out.println(cabecera + "-" + this.getNombre() + ":");
		for (Componente item : lista) {
			item.view(cabecera + " ");
		}
	}

	@Override
	public void add(Componente cc) {
		lista.add(cc);
	}

	@Override
	public void remove(Componente cc) {
		lista.remove(cc);
	}

	@Override
	public boolean isCompuesto() {
		return true;
	}

	@Override
	public String toString() {
		return "C:" + this.getNombre().toLowerCase();
	}

}