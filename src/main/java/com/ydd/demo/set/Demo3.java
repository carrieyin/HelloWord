package com.ydd.demo.set;

import java.util.HashSet;
import java.util.Scanner;

class User{
	String username;
	String pwd;
	User(String username, String pwd){
		this.username = username;
		this.pwd = pwd;
	}
	
	@Override
	public int hashCode() {
		//System.out.println(id + ":" + "name: "+ name + "   hash code 被调用了");
		//return super.hashCode();
		return username.hashCode();
	}
//	@Override
	public boolean equals(Object obj) {
		User o = (User)obj;
		System.out.println("equals is called");
		return o.username.equals(username);
	}	
//	@Override
	public String toString() {
		
		return username + "," + pwd;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet ha = new HashSet();
		while(true) {
			System.out.println("请输入用户名");
			String name = sc.next();
			System.out.println("请输入密码");
			String pwd = sc.next();
			if(ha.add(new User(name, pwd))) {
				System.out.println("注册成功");
				System.out.println("注册所有用户" + ha);
			}else
			{
				System.out.println("注册失败");
			}
		}
		
	}

}
