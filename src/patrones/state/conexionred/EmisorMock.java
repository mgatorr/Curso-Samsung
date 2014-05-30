package patrones.state.conexionred;

public final class EmisorMock implements Emisor {
	private String msg;

	@Override
	public void enviar(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}