package com.ydd.demo.enumdemo;

public enum Action implements Command {
	STOP {
		public void excute() {
			System.out.println("����ֹͣ����");
		}
	},
	RIGHT {

		public void excute() {
			System.out.println("����ֹͣ����");
		}

	}
	
}