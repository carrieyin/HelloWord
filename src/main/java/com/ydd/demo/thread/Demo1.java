package com.ydd.demo.thread;
/*
 * �����̵߳����ַ�ʽ
 * ��ʽһ���̳�Thread����������дrun����
 */
public class Demo1 extends Thread{
	
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println("�Զ����߳�:" + i);
		}
	}

	public static void main(String[] argc){
		Demo1 demo1 = new Demo1();
		//demo1.run();���ø÷������ܿ����߳�
		demo1.start();
		
		for(int i = 0; i < 10; i++){
			System.out.println("main�߳�:" + i);
		}
		
	}

}
