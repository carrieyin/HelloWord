package com.ydd.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassViewer {

	public static void main(String[] args) {
		try {
			ClassViewer.view("java.lang.String");
			System.out.println("****************");
			
			view("java.lang.Runnable");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到指定类");
		}
	
	}
	
	public static void view(String clzName) throws ClassNotFoundException{
		Class clz = Class.forName(clzName);
		
		showPackageInfo(clz);
		showClassInfo(clz);
		
		System.out.println("{");
		
		showFieldsInfo(clz);
		showConstructorInfo(clz);
		showMethodsInfo(clz);
		
		System.out.println("}");
	}
	
	private static void showPackageInfo(Class clz){
		Package p = clz.getPackage();
		System.out.printf("Package %s; %n", p.getName());
	}

	private static void showClassInfo(Class clz){
		int modifier = clz.getModifiers();
		System.out.printf("%s %s %s", Modifier.toString(modifier), Modifier.isInterface(modifier)? "" : "class", clz.getName());
		
	}
	
	private static void showFieldsInfo(Class clz){
		Field[] fields = clz.getDeclaredFields();
		for(Field field :fields){
			System.out.printf("\t%s %s %s; %n", Modifier.toString(field.getModifiers()), field.getType().getName(), field.getName());
		}
	}
	
	private static void showConstructorInfo(Class clz){
		Constructor[] constructors = clz.getDeclaredConstructors();
		for(Constructor constructor:constructors){
			System.out.printf("\t%s %s(); %n", Modifier.toString(constructor.getModifiers()), constructor.getName());
		}		
	}
	
	private static void showMethodsInfo(Class clz){
		Method[] methods = clz.getMethods();
		for(Method method: methods){
			System.out.printf("\t%s %s %s(); %n", Modifier.toString(method.getModifiers()), method.getReturnType().getName(), method.getName());
		}
	}
}
