package patrones.state;

import upm.jbb.IO;

public class StateA extends State {
	@Override
	public void action1(Context context) {
		IO.out.println("Accion1 en estado A: se cambia a estado B");
		context.setState(new StateB());
	}

	@Override
	public void action2(Context context) {
		IO.out.println("Accion2 en estado A");
	}

	@Override
	public String toString() {
		return "Estado A";
	}
}