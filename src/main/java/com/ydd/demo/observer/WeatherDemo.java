package com.ydd.demo.observer;


public class WeatherDemo {

	public static void main(String[] args) throws InterruptedException {
		WeatherStatation st = new WeatherStatation();
		Emp emp = new Emp("小明");
		Student stu = new Student("小花");
		st.addUser(emp);
		st.addUser(stu);
		st.start();
		
			
		
	}

}
