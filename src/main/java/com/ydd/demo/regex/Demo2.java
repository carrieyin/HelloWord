package com.ydd.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {
		String content = "da jia ni meng wo hai kaikai xinxin";
		String reg = "\\b[a-zA-Z]{3}\\b";
		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(content);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}

}
