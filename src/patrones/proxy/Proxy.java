package patrones.proxy;

import upm.jbb.IO;

public class Proxy extends Sujeto {
	private Sujeto sujetoReal;

	public Proxy() {
		this.sujetoReal = null;
	}

	@Override
	public void peticion() {
		if (this.sujetoReal == null) {
			this.sujetoReal = new SujetoReal();
		}
		this.sujetoReal.peticion();
	}

	@Override
	public void peticion2() {
		if (this.sujetoReal == null) {
			IO.out.println("Peticion 2: responde proxy");
		} else {
			this.sujetoReal.peticion2();
		}
	}
}