package com.ydd.demo.thread;

class DeadLock extends Thread{

	public DeadLock(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		if("����".equals(Thread.currentThread().getName())){
			synchronized ("ң����") {
				System.out.println("���� get ң����");
				
				synchronized ("���"){
					System.out.println("���� get ��أ����Դ��յ���");
				}
				
			}
		}
		else{
			synchronized ("���") {
				System.out.println("���� get ң����");
				
				synchronized ("ң����"){
					System.out.println("���� get ��أ����Դ��յ���");
				}
				
			}
		}
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock("����");
		DeadLock deadLock2 = new DeadLock("����");
		deadLock.start();
		deadLock2.start();

	}

}


