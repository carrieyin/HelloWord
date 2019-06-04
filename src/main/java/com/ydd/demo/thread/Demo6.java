package com.ydd.demo.thread;

public class Demo6 implements Runnable{
	public void run() {
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Demo6 demo6 = new Demo6();
		Thread thread = new Thread(demo6);
		thread.start();
	
	}
}
