package patrones.singlenton.logger;

import java.util.Date;

import upm.jbb.IO;

public class Logger {
	private String logs;

	public Logger() {
		this.clear();
	}

	public String getLogs() {
		return logs;
	}
	

	public void addLog(String log) {
		this.logs = this.logs + ">>> " + log + "\n";
	}

	public void clear() {
		this.logs = new Date().toString() + "\n";
	}

	public void print() {
		IO.out.print(this.logs);
	}
}