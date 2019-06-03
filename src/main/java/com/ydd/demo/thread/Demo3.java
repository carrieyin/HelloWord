package com.ydd.demo.thread;

public class Demo3 extends Thread{
	
	public void run() { //�˴��׳��쳣��������δ�׳��쳣�����಻���׳�
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1000); //�˴�ֻ��try catch �����׳�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i : " + i);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Demo3 d1 = new Demo3();
		System.out.println(d1.getName());
		d1.sleep(1000); //ע���������߳���sleep��˭ִ��˭sleep
		d1.setName("����");
		d1.setPriority(10);
		d1.start();
		
		System.out.println("�Զ��� ���ȼ�:" + d1.getPriority());
		System.out.println("�Զ����̵߳����ȼ���" + d1.getPriority());
		System.out.println("main�̵߳����ȼ�:" +Thread.currentThread().getPriority());
	}

}
