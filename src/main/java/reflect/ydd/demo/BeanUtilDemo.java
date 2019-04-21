package reflect.ydd.demo;

import java.util.HashMap;
import java.util.Map;

public class BeanUtilDemo {

	public static void main(String[] args) throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", "Jsution");
		data.put("score", 90);
		Student stu = (Student)BeanUtil.getBean(data, "reflect.ydd.demo.Student");
		
		System.out.println(stu.toString());
		
		
		
	}

}
