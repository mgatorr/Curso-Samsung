package patrones.flyweight;

public final class FlyweightMain {
	private FlyweightMain() {
	}

	public static void main(String[] args) {
		Factoria factoria = new Factoria();
		PesoLigeroConcreto[] array = new PesoLigeroConcreto[5];
		array[0] = factoria.get("ocho");
		array[1] = factoria.get("tres");
		array[2] = factoria.get("ocho");
		array[3] = factoria.get("dos");
		array[4] = factoria.get("tres");

		for (PesoLigeroConcreto pesoLigeroConcreto : array) {
			pesoLigeroConcreto.operacion("--");
		}

		for (PesoLigeroConcreto pesoLigeroConcreto : array) {
			pesoLigeroConcreto.operacion("..");
		}

	}
}