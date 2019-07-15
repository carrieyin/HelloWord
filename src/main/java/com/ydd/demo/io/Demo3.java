package com.ydd.demo.io;

import java.io.File;
import java.io.FilenameFilter;
class MyFilter implements FilenameFilter{

	public boolean accept(File file, String name) {
		if(name.endsWith(".txt"))
		{
				return true;
		}
		
		return false;
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		File file = new File("/Users/yicj/code/eclipse-workspace/HelloWord");
		
		File[] listFiles = file.listFiles(new MyFilter());
		for(File fileItem: listFiles) {
			System.out.println(fileItem.getName());
		}
	}

}
