package com.ydd.demo.observer;

public class Student implements Weather{
	String name;
	Student(String name){
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		if("����".equals(weather)){
			System.out.println(name + "��·��ѧ");
		}
		else if("�η�".equals(weather)){
			System.out.println(name + "�ż�");
		}else if("����".equals(weather)){
			System.out.println(name + "ѧУͣ��");
		}else if("����".equals(weather)){
			System.out.println(name + "�������Ͽ�");
		}else{
			System.out.println(name + "�����Ͽ�");	
		}
	}
}
