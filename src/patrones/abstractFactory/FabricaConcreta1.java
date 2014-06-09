package patrones.abstractFactory;

public class FabricaConcreta1 extends FabricaAbstracta {
	@Override
	public ProductoAbstractoA crearProductoA() {
		return new ProductoA1();
	}

	@Override
	public ProductoAbstractoB crearProductoB() {
		return new ProductoB1();
	}

	@Override
	public String toString() {
		return "FabricaConcreta1";
	}
}