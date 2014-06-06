package patrones.command.calculadora;

import java.util.HashSet;
import java.util.Set;

import upm.jbb.IO;

public class MainGestorComandos {
	private Set<Comando> comandos = new HashSet<Comando>();

	public void add(Comando comando) {
		this.comandos.add(comando);
	}

	public void ejecutar() {
		Comando comando = (Comando) IO.in.select(this.comandos.toArray());
		comando.execute();
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		MainGestorComandos gestor = new MainGestorComandos();
		gestor.add(new ComandoSumar(calc));
		gestor.add(new ComandoRestar(calc));
		gestor.add(new ComandoIniciar(calc));
		gestor.add(new ComandoImprimir(calc));
		IO.in.addController(gestor);
	}

}