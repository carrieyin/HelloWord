package com.ydd.demo.thread;

class DeadLock extends Thread{

	public DeadLock(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		if("张三".equals(Thread.currentThread().getName())){
			synchronized ("遥控器") {
				System.out.println("张三 get 遥控器");
				
				synchronized ("电池"){
					System.out.println("张三 get 电池，可以吹空调了");
				}
				
			}
		}
		else{
			synchronized ("电池") {
				System.out.println("李四 get 遥控器");
				
				synchronized ("遥控器"){
					System.out.println("李四 get 电池，可以吹空调了");
				}
				
			}
		}
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock("张三");
		DeadLock deadLock2 = new DeadLock("李四");
		deadLock.start();
		deadLock2.start();

	}

}


