package com.ydd.demo.observer;

public class Emp implements Weather{
	String name;
	public Emp(String name) {
		this.name = name;
	}
	
	public void notifyWeather(String weather){
		if("晴天".equals(weather)){
			System.out.println(name + "直接上班");
		}
		else if("刮风".equals(weather)){
			System.out.println(name + "带着石头上班");
		}else if("下雨".equals(weather)){
			System.out.println(name + "打伞上班");
		}else if("雾霾".equals(weather)){
			System.out.println(name + "头盔上班");
		}else{
			System.out.println(name + "坐车上班");	
		}
	}
}
