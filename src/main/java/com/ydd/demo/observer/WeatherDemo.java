package com.ydd.demo.observer;


public class WeatherDemo {

	public static void main(String[] args) throws InterruptedException {
		WeatherStatation st = new WeatherStatation();
		Emp emp = new Emp("С��");
		Student stu = new Student("С��");
		st.addUser(emp);
		st.addUser(stu);
		st.start();
		
			
		
	}

}
