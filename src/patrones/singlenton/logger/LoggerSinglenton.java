package patrones.singlenton.logger;

import java.util.Date;

import upm.jbb.IO;

public final class LoggerSinglenton {
	private static LoggerSinglenton logger = new LoggerSinglenton();
	private String logs;

	private LoggerSinglenton() {
		this.clear();
	}

	public static LoggerSinglenton getLoggerSinglenton() {
		return LoggerSinglenton.logger;
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
