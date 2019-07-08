package com.ydd.demo.io;

import java.io.File;

public class Demo2 {

	public static void main(String[] args) {
		File[] fileroot = File.listRoots();
		for(File file : fileroot) {
			System.out.println(file);
		}
		
		File file = new File("/Users/yicj/code/eclipse-workspace/HelloWord/");
//		String[] filenames = file.list();
//		for(String name :filenames) {
//			System.out.println(name);
//		}
		
		File[] files = file.listFiles();
		for(File fileitem :files) {
			System.out.println(fileitem.getName());
		}
	}

}
