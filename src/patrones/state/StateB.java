package patrones.state;

import upm.jbb.IO;

public class StateB extends State {
	@Override
	public void action1(Context contexto) {
		IO.out.println("Accion1 en estado B");
	}

	@Override
	public void action2(Context context) {
		IO.out.println("Accion2 en estado B: se cambia a estado A");
		context.setState(new StateA());
	}

	@Override
	public String toString() {
		return "Estado B";
	}
}