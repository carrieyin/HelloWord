package com.ydd.demo.io;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("/user/yicj/a.txt");
		f.exists();
		
		File f1 = new File("."); 
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("/Users/yicj/code/eclipse-workspace/HelloWord/aaa.txt");
		f2.createNewFile();
	}

}
