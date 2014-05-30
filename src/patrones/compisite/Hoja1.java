package patrones.compisite;

import upm.jbb.IO;

public class Hoja1 extends Componente {

	public Hoja1(String nombre) {
		super(nombre);
	}

	@Override
	public void view(String cabecera) {
		IO.out.println(cabecera + "-" + this.toString());
	}

	@Override
	public String toString() {
		return "H1:" + this.getNombre().toLowerCase();
	}

	@Override
	public void remove(Componente cc) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void add(Componente cc) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public boolean isCompuesto() {
		return false;
	}

}