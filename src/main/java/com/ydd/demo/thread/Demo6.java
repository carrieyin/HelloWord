package com.ydd.demo.thread;

public class Demo6 implements Runnable {
	int num = 50;// �˴�����Ҫstatic���� ��Ϊʹ�õ���ͬһ��demo����

	public void run() {
		while (true) {
			synchronized ("��") {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "���ˣ�"
							+ num + "��Ʊ");
					num--;
				} else {
					System.out.println("������");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Demo6 demo6 = new Demo6();
		Thread thread = new Thread(demo6, "�߳�1");
		Thread thread1 = new Thread(demo6, "�߳�2");
		Thread thread2 = new Thread(demo6, "�߳�3");
		thread.start();
		thread1.start();
		thread2.start();
	}
}
