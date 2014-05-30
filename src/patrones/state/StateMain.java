package patrones.state;

import upm.jbb.IO;

public class StateMain {
	private Context c = new Context();

	public void state() {
		IO.out.println(this.c.toString());
	}

	public void accion1() {
		this.c.action1();
	}

	public void accion2() {
		this.c.action2();
	}

	public static void main(String[] args) {
		IO.in.addController(new StateMain());
	}
}