package reflect.ydd.demo;

public class PoxyDemo {

	public static void main(String[] args) {
		LoggingHandler loggingHandler = new LoggingHandler();
		Hello helloProxy = (Hello)loggingHandler.bind(new HelloSpeaker());
		helloProxy.hello("test123");
	}

}
