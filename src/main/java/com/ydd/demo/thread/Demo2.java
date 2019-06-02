package com.ydd.demo.thread;

class Video extends Thread{

	public void run() {
		while(true){
			System.out.println("йсфа");
		}
	}
	
}

class Talk extends Thread{
	public void run() {
		while(true){
			System.out.println("адлЛ");
		}
	}
}

class Demo2{
	public static void main(String[] args) {
		Video v = new Video();
		v.start();
		Talk t = new Talk();
		t.start();	
	}
}