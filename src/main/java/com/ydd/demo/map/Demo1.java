package com.ydd.demo.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//add
		map.put("����", "������");
		map.put("л����", "�Ű�֥");
		map.put("������", "Ԭӽ��");
		
		Map<String, String> m = new HashMap<String, String>();
		m.put("ϰ���", "����");
		m.put("��", "Ԭ");
		
		map.putAll(m);
		
		//del
		//map.remove("����");
		
		//��ѯ
		String str = map.get("������");
		System.out.println(str);
		System.out.println("����key:" + map.containsKey("������"));
		System.out.println("����value:" + map.containsValue("Ԭӽ��"));
		System.out.println(map);
		
		//
	}

}
