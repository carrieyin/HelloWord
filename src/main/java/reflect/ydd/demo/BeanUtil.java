package reflect.ydd.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BeanUtil {
	
	public static  <T> T getBean(Map<String, Object> data, String clzName) throws Exception{
		Class clz = Class.forName(clzName);
		Object bean = clz.newInstance();
		
		Set<Entry<String, Object>> entrySet = data.entrySet();
		for(Entry<String,Object> entry: entrySet){
			String setter = String.format("set%s%s", entry.getKey().substring(0, 1).toUpperCase(), 
													entry.getKey().substring(1));
			
			Method method = clz.getMethod(setter, entry.getValue().getClass());
			if(Modifier.isPublic(method.getModifiers())){
				method.invoke(bean, entry.getValue());
			}
		}
		return (T)bean;
	}
		
}


