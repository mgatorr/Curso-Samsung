package patrones.command.calculadora.memento;

public class MementoCalculadora {
	private int nuemeroRestaurar;

	public MementoCalculadora(int numero) {
		this.setNuemeroRestaurar(numero);
	}

	public int getNuemeroRestaurar() {
		return nuemeroRestaurar;
	}

	public void setNuemeroRestaurar(int nuemeroRestaurar) {
		this.nuemeroRestaurar = nuemeroRestaurar;
	}

}
