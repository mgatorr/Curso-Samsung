package patrones.texto;

public abstract class Componente {

	public Componente() {
	}
	public abstract void add(Componente componet);
	public abstract void remove(Componente componet);
	public abstract boolean isComposite();
	public abstract String dibujar(boolean mayus);
}
