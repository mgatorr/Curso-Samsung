package patrones.command.calculadora.memento;

import java.util.HashSet;
import java.util.Set;

import patrones.command.calculadora.Comando;
import patrones.command.calculadora.ComandoImprimir;
import patrones.command.calculadora.ComandoIniciar;
import patrones.command.calculadora.ComandoRestar;
import patrones.command.calculadora.ComandoSumar;
import upm.jbb.IO;
import upm.jbb.io.Log;

public class MainGestorComandos2 {
	private Set<Comando> comandos = new HashSet<Comando>();

	public void add(Comando comando) {
		this.comandos.add(comando);
	}

	public void ejecutar() {
		Comando comando = (Comando) IO.in.select(this.comandos.toArray());
		comando.execute();
	}

	public static void main(String[] args) {
		CalculadoraMementable calc = new CalculadoraMementable();
		MainGestorComandos2 gestorCom = new MainGestorComandos2();
		GestorMementos<MementoCalculadora> gestorMem = new GestorMementos<MementoCalculadora>();
		gestorCom.add(new ComandoSumar(calc));
		gestorCom.add(new ComandoRestar(calc));
		gestorCom.add(new ComandoIniciar(calc));
		gestorCom.add(new ComandoImprimir(calc));
		gestorCom.add(new ComandoGuardar(calc, gestorMem));
		gestorCom.add(new ComandoDeshacer(calc, gestorMem));
		IO.in.addController(gestorCom);
		IO.out.setLog(Log.DEBUG);
	}
}