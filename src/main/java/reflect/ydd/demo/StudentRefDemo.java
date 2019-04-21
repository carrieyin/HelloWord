package reflect.ydd.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StudentRefDemo {

	public static void main(String[] args) throws Exception {
		Class clz = Class.forName("reflect.ydd.demo.Student");
		Constructor constructor = clz.getConstructor(String.class, Integer.class);
		Object obj = constructor.newInstance("abc", 99);
		Method method = clz.getMethod("setName", String.class);
		method.invoke(obj, "88888");
		
		Method getter = clz.getMethod("getName", null);
		System.out.println(getter.invoke(obj));
	}

}
