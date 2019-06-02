package com.ydd.demo.thread;
/*
 * 创建线程的两种方式
 * 方式一：继承Thread，该子类重写run方法
 */
public class Demo1 extends Thread{
	
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println("自定义线程:" + i);
		}
	}

	public static void main(String[] argc){
		Demo1 demo1 = new Demo1();
		//demo1.run();调用该方法不能开启线程
		demo1.start();
		
		for(int i = 0; i < 10; i++){
			System.out.println("main线程:" + i);
		}
		
	}

}
