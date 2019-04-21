package reflect.ydd.demo;

public class ClassLoaderHierarchy {

	public static void main(String[] args) {
		System.out.println("boot dir:" + System.getProperty("sun.boot.class.path"));
		System.out.println("ext dir: " + System.getProperty("java.ext.dirs"));
		System.out.println("classpath dir:" + System.getProperty("java.class.path"));
		
		Some some = new Some();
		Class class1 = some.getClass();
		ClassLoader classLoader = class1.getClassLoader();
		System.out.println(classLoader);
		System.out.println(classLoader.getParent());
		System.out.println(classLoader.getParent().getParent());
		
	}

}
