package reflect.ydd.demo;

import java.lang.reflect.Constructor;

public class Some2Demo {
	
	public static void main(String[] args) throws Exception {
		//Class clz = Class.forName("reflect.ydd.demo.Some", false, Some.class.getClassLoader());
		Class clazz =  Class.forName("reflect.ydd.demo.Some");
		Class cl1 = Class.forName("reflect.ydd.demo.Some", false, Some.class.getClassLoader());
		Class cl2 = Class.forName("reflect.ydd.demo.Some", false, Some2Demo.class.getClassLoader());
		System.out.printf("equal :%s %n" , cl1 == cl2);
		System.out.printf("some loader %s %n", Some.class.getClassLoader().getClass().getName());
		System.out.printf("somedemo2 loader %s %n", Some2Demo.class.getClassLoader().getClass().getName());
		System.out.println("²Î¿¼Some");
		Constructor constructor =  clazz.getConstructor()  ;
		Some obj = (Some)constructor.newInstance() ;
		System.out.println(obj.getClass().getName());
		Package package1 = String.class.getPackage();
		System.out.println(package1.getName());
		//s = new Some();
		//System.out.println("ÊµÀýsome");
	}

}
