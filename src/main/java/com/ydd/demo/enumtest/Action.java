package com.ydd.demo.enumtest;

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