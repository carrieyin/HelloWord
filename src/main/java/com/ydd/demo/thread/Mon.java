package com.ydd.demo.thread;

import java.util.Map;
import java.util.Set;

public class Mon extends Thread{
	@Override
	public void run() {
		System.out.println("����ϴ��");
		System.out.println("�����в�");
		System.out.println("���跢��û����");
		Son s = new Son();
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����������");
		System.out.println("���賭��Է���");
	}

	public static void main(String[] args) {
		//List<String> list ;
//		Map<String,String> map ;
//		Set<String> set ;
		Mon m = new Mon();
		
		m.start();
		
	}

}

class Son extends Thread{
	@Override
	public void run() {
		System.out.println("������¥");
		System.out.println("��������");
		System.out.println("������¥");
		
	}
	
}

