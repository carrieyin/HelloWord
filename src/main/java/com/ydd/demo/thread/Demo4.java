package com.ydd.demo.thread;

class SaleTicket extends Thread{
	static int num = 50;
	@Override
	public void run() {
		while(true){
			synchronized ("锁定对象") {
				if(num > 0){
					System.out.println(Thread.currentThread().getName() + "卖了:" + num);
					num--;
				}
				else
				{
					System.out.println("售罄了");
					break;
					
				}
				
			}
			
		}
	}
}
public class Demo4 {
	public static void main(String[] argc){
		SaleTicket s1 = new SaleTicket();
		s1.start();
		SaleTicket s2 = new SaleTicket();
		s2.start();
		SaleTicket s3 = new SaleTicket();
		s3.start();
	}

}
