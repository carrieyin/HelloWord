package com.ydd.demo.single;

class single{
	public static single s;
	private single(){
		
	}
	
	public single getInstance(){
		
			if (s == null) {
				synchronized("Ëø")
				{
					if(s == null){
						s = new single();
					}
				}
			}
		
		return s;
	}
}
public class demo1 {

	public static void main(String[] args) {
		
	}

}
