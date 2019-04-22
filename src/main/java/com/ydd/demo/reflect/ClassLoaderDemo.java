package com.ydd.demo.reflect;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderDemo {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
		String path = "file:/F:/code/classes/";
		String clzName = "reflect.ydd.demo.Some";
		System.out.println(path);
		
		Class clz1 = loadClassFrom(path, clzName);
		System.out.println(clz1);		
		
		Class clz2 = loadClassFrom(path, clzName);
		System.out.println(clz2);
		
		String ttt = clz1.getClassLoader().getClass().getName() ;
		System.out.println("ttt: " + ttt);
		String ttt2 = clz2.getClassLoader().getClass().getName() ;
		System.out.println("ttt2: " + ttt2);
		
		System.out.printf("clz1 与 clz2 为 %s 实例", clz1 == clz2 ? "相同":"不同");
		
	}

	private static Class loadClassFrom(String path, String clzName) throws MalformedURLException, ClassNotFoundException {
		URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL(path)});
		return urlClassLoader.loadClass(clzName);
	}

}
