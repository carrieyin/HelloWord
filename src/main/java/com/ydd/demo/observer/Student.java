package com.ydd.demo.observer;

public class Student implements Weather{
	String name;
	Student(String name){
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		if("晴天".equals(weather)){
			System.out.println(name + "走路上学");
		}
		else if("刮风".equals(weather)){
			System.out.println(name + "放假");
		}else if("下雨".equals(weather)){
			System.out.println(name + "学校停课");
		}else if("雾霾".equals(weather)){
			System.out.println(name + "戴口罩上课");
		}else{
			System.out.println(name + "正常上课");	
		}
	}
}
