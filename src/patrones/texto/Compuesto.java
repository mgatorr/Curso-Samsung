package patrones.texto;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {
	private List<Componente> compuesto;

	public Compuesto() {
		this.compuesto = new ArrayList<Componente>();
	}

	public List<Componente> getCompuesto() {
		return compuesto;
	}

	@Override
	public abstract void add(Componente componet);

	@Override
	public abstract void remove(Componente componet);

	@Override
	public boolean isComposite() {

		return true;
	}
	
	@Override
	public abstract String dibujar(boolean mayus);


}
