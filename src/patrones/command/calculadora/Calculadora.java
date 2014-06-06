package patrones.command.calculadora;

public class Calculadora{
	private int total;

	public Calculadora() {
		this.iniciar();
	}

	public int getTotal() {
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void sumar(int valor) {
		this.setTotal(this.total + valor);
	}

	public void restar(int valor) {
		this.setTotal(this.total - valor);
	}

	public void iniciar() {
		this.setTotal(0);
	}

	@Override
	public String toString() {
		return " Total = " + getTotal();
	}
}