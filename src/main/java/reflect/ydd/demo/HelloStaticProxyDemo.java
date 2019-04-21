package reflect.ydd.demo;

public class HelloStaticProxyDemo {
	
	public static void main(String[] args){
		Hello proxy = new HelloProxy(new HelloSpeaker());
		proxy.hello("test");
	}
}
