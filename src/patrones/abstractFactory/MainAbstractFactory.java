package patrones.abstractFactory;

import upm.jbb.IO;

public class MainAbstractFactory {
	private FabricaAbstracta fa;
	private FabricaAbstracta[] fas = { new FabricaConcreta1(),
			new FabricaConcreta2() };

	public void tipoFabrica() {
		fa = (FabricaAbstracta) IO.in.select(fas, "Elige una fábrica");
	}

	public void fabricarProductos() {
		fa.crearProductoA().view();
		fa.crearProductoB().view();
	}

	public static void main(String[] args) {
		IO.in.addController(new MainAbstractFactory());
	}
}