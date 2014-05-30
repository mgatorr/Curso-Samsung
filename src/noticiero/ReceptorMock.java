package noticiero;

public class ReceptorMock implements Receptor {

	private String texto = "";

	public ReceptorMock() {

	}

	public String getTexto() {
		return texto;
	}

	@Override
	public void noticia(String texto) {
		this.texto = texto;

	}

}
