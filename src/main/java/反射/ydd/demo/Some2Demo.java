package 反射.ydd.demo;

import java.lang.reflect.Constructor;

public class Some2Demo {
	
	public static void main(String[] args) throws Exception {
		//Class clz = Class.forName("反射.ydd.demo.Some", false, Some.class.getClassLoader());
		Class clazz =  Class.forName("反射.ydd.demo.Some");
		Class cl1 = Class.forName("反射.ydd.demo.Some", false, Some.class.getClassLoader());
		Class cl2 = Class.forName("反射.ydd.demo.Some", false, Some2Demo.class.getClassLoader());
		System.out.printf("equal :%s %n" , cl1 == cl2);
		System.out.printf("some loader %s %n", Some.class.getClassLoader().getClass().getName());
		System.out.printf("somedemo2 loader %s %n", Some2Demo.class.getClassLoader().getClass().getName());
		System.out.println("参考Some");
		Constructor constructor =  clazz.getConstructor()  ;
		Some obj = (Some)constructor.newInstance() ;
		System.out.println(obj.getClass().getName());
		Package package1 = String.class.getPackage();
		System.out.println(package1.getName());
		//s = new Some();
		//System.out.println("实例some");
	}

}
