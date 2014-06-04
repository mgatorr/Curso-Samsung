package patrones.proxy.service;

import java.util.Date;

public class Proxy implements Service {
	private long log1;
	private long log2;
	private Server server;

	public Proxy() {
		this.server = new Server();
	}

	@Override
	public void service() {
		this.log1 = new Date().getTime();
		server.service();
		this.log2 = new Date().getTime();
		System.out.println("[Server:service]" + new Date().toString() + ">>>"
				+ (log2 - log1));
	}

}
