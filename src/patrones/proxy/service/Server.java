package patrones.proxy.service;

import java.util.Random;

public class Server implements Service {
	private Random random;

	public Server() {
		this.random = new Random();
	}

	public void service() {
		try {
			Thread.sleep(Math.round(this.random.nextDouble()*3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}