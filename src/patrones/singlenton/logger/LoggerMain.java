package patrones.singlenton.logger;

public final class LoggerMain {

	public static void main(String[] args) {
		LoggerSinglenton obj1;
		obj1 = LoggerSinglenton.getLoggerSinglenton();
		
		obj1.addLog("log1");
		obj1.addLog("log2");
		obj1.print();

	}

}
