package com.ydd.demo.thread;

public class Demo8 extends Thread{
	boolean flag = true;
	public Demo8(String name){
		super(name);
	}

	@Override
	public void run() {
		int i = 0;
		while(true){
			System.out.println(Thread.currentThread().getName() + ":" + i);
			i++;
		}
	}
	public static void main(String[] args) {
		Demo8 d = new Demo8("¹·ÍÞ");
		d.setDaemon(true);
		d.start();
		
		for(int i = 0; i < 100; i ++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
	}

}
