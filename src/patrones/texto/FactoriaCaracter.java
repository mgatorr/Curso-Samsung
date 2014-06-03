package patrones.texto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private static FactoriaCaracter factoria = null;
	private Map<Character, Caracter> almacen;

	private FactoriaCaracter() {
		this.almacen = new HashMap<Character, Caracter>();
	}

	public static FactoriaCaracter getFactoria() {
		if (FactoriaCaracter.factoria == null) {
			FactoriaCaracter.factoria = new FactoriaCaracter();
		}
		return FactoriaCaracter.factoria;
	}

	public Caracter get(char letra) {
		if (!this.almacen.containsKey(letra)) {
			almacen.put(letra, new Caracter(letra));
		}
		return almacen.get(letra);
	}

}
