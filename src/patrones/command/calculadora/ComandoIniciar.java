package patrones.command.calculadora;

public class ComandoIniciar implements Comando {
	private Calculadora calculadora;

	public ComandoIniciar (Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	@Override
	public void execute() {
		this.calculadora.iniciar();

	}

}
