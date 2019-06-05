package com.ydd.demo.thread;

public class Demo6 implements Runnable {
	int num = 50;// 此处不需要static修饰 因为使用的是同一个demo对象

	public void run() {
		while (true) {
			synchronized ("锁") {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "卖了："
							+ num + "号票");
					num--;
				} else {
					System.out.println("卖完了");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Demo6 demo6 = new Demo6();
		Thread thread = new Thread(demo6, "线程1");
		Thread thread1 = new Thread(demo6, "线程2");
		Thread thread2 = new Thread(demo6, "线程3");
		thread.start();
		thread1.start();
		thread2.start();
	}
}
