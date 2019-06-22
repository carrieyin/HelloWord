package com.ydd.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Íô·å", "ÕÂ×Óâù");
		map.put("Ğ»öª·æ", "ÕÅ°ØÖ¥");
		map.put("ÕÅÖÇÁØ", "Ô¬Ó½ÒÇ");
		
		/*Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collection<String> c = map.values();
		Iterator<String> itc = c.iterator();
		while(itc.hasNext()){
			System.out.println(itc.next());
		}*/
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Entry<String, String> next = it.next();
			System.out.println("¼ü:"+ next.getKey() + "  Öµ:"+ next.getValue());
		}
	}

}
