package com.ydd.demo.thread;

public class Demo3 extends Thread{
	
	public void run() { //此处抛出异常报错，父类未抛出异常，子类不能抛出
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1000); //此处只能try catch 不能抛出
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
		d1.sleep(1000); //注意这是主线程在sleep，谁执行谁sleep
		d1.setName("狗娃");
		d1.setPriority(10);
		d1.start();
		
		System.out.println("自定义 优先级:" + d1.getPriority());
		System.out.println("自定义线程的优先级：" + d1.getPriority());
		System.out.println("main线程的优先级:" +Thread.currentThread().getPriority());
	}

}
