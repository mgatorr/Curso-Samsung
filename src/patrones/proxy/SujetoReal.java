package patrones.proxy;

import upm.jbb.IO;

public class SujetoReal extends Sujeto {
	@Override
	public void peticion() {
		IO.out.println("Peticion 1: responde el real");
	}

	@Override
	public void peticion2() {
		IO.out.println("Peticion 2: responde el real");
	}
}