package com.ydd.demo.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//add
		map.put("Íô·å", "ÕÂ×Óâù");
		map.put("Ğ»öª·æ", "ÕÅ°ØÖ¥");
		map.put("ÕÅÖÇÁØ", "Ô¬Ó½ÒÇ");
		
		Map<String, String> m = new HashMap<String, String>();
		m.put("Ï°´ó´ó", "Åí´ó´ó");
		m.put("ÕÅ", "Ô¬");
		
		map.putAll(m);
		
		//del
		//map.remove("Íô·å");
		
		//²éÑ¯
		String str = map.get("ÕÅÖÇÁØ");
		System.out.println(str);
		System.out.println("°üº¬key:" + map.containsKey("ÕÅÖÇÁØ"));
		System.out.println("°üº¬value:" + map.containsValue("Ô¬Ó½ÒÇ"));
		System.out.println(map);
		
		//
	}

}
