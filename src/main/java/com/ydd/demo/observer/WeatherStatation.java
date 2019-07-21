package com.ydd.demo.observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStatation {
	String[] weathers = {"����", "�η�", "����","����","����"};
	String weather;
	ArrayList<Weather> array = new ArrayList<Weather>();
	public void addUser(Weather w)
	{
		array.add(w);
	}
	
	public void start() throws InterruptedException{
		new Thread(){
			public void run() {
				while (true) {
					Random rand = new Random();
					int s = 1000 + rand.nextInt(501);
					updateWeather();
					for(Weather w: array){
						w.notifyWeather(weather);
					}
					try {
						Thread.sleep(s);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
	}

	public void updateWeather(){
		Random rand = new Random();
		int index = rand.nextInt(weathers.length);
		weather = weathers[index];
		System.out.println("��ǰ������:" + weather);
		
		
	}
		

}
