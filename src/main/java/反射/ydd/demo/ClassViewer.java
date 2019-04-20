package ∑¥…‰.ydd.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ClassViewer {

	public static void main(String[] args) {
	
	}
	
	public static void view(String clzName) throws ClassNotFoundException
	{
		Class.forName(clzName);
	}
	
	private static void showPackageInfo(Class clz)
	{
		Package p = clz.getPackage();
		System.out.printf("Package %s; %n", p.getName());
	}

	private static void showClassInfo(Class clz)
	{
		int modifier = clz.getModifiers();
		System.out.printf("%s %s %s", Modifier.toString(modifier), Modifier.isInterface(modifier)? "interface" : "class", clz.getName());
		
	}
	
	private static void showFieldsInfo(Class clz)
	{
		Field[] fields = clz.getDeclaredFields();
		for(Field field :fields){
			System.out.printf("\t %s %s %s;", Modifier.toString(field.getModifiers()));
		}
	}
}
