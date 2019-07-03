package com.ydd.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
		String content = "������ϵ��23@qq.com ��ʱ��ϵ��1223293u@qq.com.cn ��ϵ 676768796@123.cn";
		String reg = "[a-zA-Z1-9]\\w{1,}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(content);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
