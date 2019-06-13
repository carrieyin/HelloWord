package com.ydd.demo.thread;

import java.util.Map;
import java.util.Set;

public class Mon extends Thread{
	@Override
	public void run() {
		System.out.println("ÂèÂèÏ´²Ë");
		System.out.println("ÂèÂèÇĞ²Ë");
		System.out.println("ÂèÂè·¢ÏÖÃ»½´ÓÍ");
		Son s = new Son();
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ÂèÂè¼ÌĞø³´²Ë");
		System.out.println("ÂèÂè³­Íê³Ô·¹ÁË");
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
		System.out.println("¶ù×ÓÏÂÂ¥");
		System.out.println("¶ù×ÓÂò½´ÓÍ");
		System.out.println("¶ù×ÓÉÏÂ¥");
		
	}
	
}

