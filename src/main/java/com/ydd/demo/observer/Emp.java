package com.ydd.demo.observer;

public class Emp implements Weather{
	String name;
	public Emp(String name) {
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		if("����".equals(weather)){
			System.out.println(name + "ֱ���ϰ�");
		}
		else if("�η�".equals(weather)){
			System.out.println(name + "����ʯͷ�ϰ�");
		}else if("����".equals(weather)){
			System.out.println(name + "��ɡ�ϰ�");
		}else if("����".equals(weather)){
			System.out.println(name + "ͷ���ϰ�");
		}else{
			System.out.println(name + "�����ϰ�");	
		}
	}
}
