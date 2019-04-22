package reflect.ydd.demo;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;


public class Some {
	static{
		System.out.println("Some加载");
	}
	
	public Some(){
		
	}
	
	public Some(String name){
		
	}
	
	public Some(String name,Integer age){
		
	}
	
	
	
	static{
		System.out.println("载入some .class 文档");
	}
	
	public static void main(String[] args) throws Exception {
		//Some.class.newInstance() ;
		/*Class clazz = Class.forName("反射.ydd.demo.Some") ;
		//clazz.newInstance() ;
		
		Class[] empty = {};
		Constructor constructor = clazz.getConstructor(empty);
		constructor.newInstance() ;*/
		
	/*	Object [] arr = new Object [10] ;
		arr[0] = "1122" ;
		arr[1] = new ArrayList() ;
		arr[2] = new Object() ;
		arr[2] = new Object[2] ;
		*/
		/*int [] aa = new int [2] ;
		
		Class clz =  Array.class ;
		Class[] ps = {Integer.class} ;
		Constructor constructor = clz.getConstructor(ps);
		constructor.newInstance(10) ;
		*/
		
//		ArrayList list = new ArrayList() ;
//		
//		list.add("one") ;
//		list.add("two") ;
		//String [] strs = list.toArray() ;
		
		
		/*Object array = Array.newInstance(Integer.class, 10);
		Array.set(array, 0, 111);
		Object object = Array.get(array, 0);
		System.out.println(object);*/
		
		Integer [] array = (Integer [])Array.newInstance(Integer.class, 10);
		array[0] = 111;
		System.out.println(array[0]);
		
		
		Integer [] arr = new Integer[2] ;
		
		new Some("111") ;
		
		
		
	}
	
}
