package com.ydd.demo.thread;

class Product {
	String name;
	double pric;
	boolean flag = false;

}

class Producer extends Thread {
	Product p;

	public Producer(Product po) {
		p = po;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			synchronized (p) {
				if (p.flag == false) {
					if (i % 2 == 0) {
						p.name = "ƻ��";
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						p.pric = 6.5;
					} else {
						p.name = "�㽶";
						p.pric = 2;
					}
					i++;
					System.out.println("������" + p.name + "�۸�:" + p.pric);
					p.flag = true;
					p.notify();
				} else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}
	}
}

class Consumer extends Thread {
	Product p;

	public Consumer(Product po) {
		p = po;
	}

	public void run() {
		while (true) {

			synchronized (p) {
				if (p.flag == true) {
					System.out.println("������" + p.name + "�۸�:" + p.pric);
					p.flag = false;
					p.notify();
					
				} else {
					
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
	}
}

public class Demo7 {

	public static void main(String[] args) {
		Product p = new Product();
		Producer po = new Producer(p);
		Consumer co = new Consumer(p);
		po.start();
		co.start();
	}

}
