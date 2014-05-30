package noticiero;

import java.util.ArrayList;
import java.util.List;

public class Noticiero {

	private List<Receptor> receptores = new ArrayList<>();

	public Noticiero() {

	}

	public List<Receptor> getReceptores() {
		return receptores;
	}

	public void registrar(Receptor receptor) {
		receptores.add(receptor);

	}

	public void informar(String texto) {
		for (Receptor recp : receptores) {
			recp.noticia(texto);
		}

	}

}
