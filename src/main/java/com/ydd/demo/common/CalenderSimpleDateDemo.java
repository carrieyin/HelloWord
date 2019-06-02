package com.ydd.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CalenderSimpleDateDemo {

	public static void main(String[] args) throws ParseException {

		Calendar ca = Calendar.getInstance();
		System.out.println("Äê:" + ca.get(Calendar.YEAR));
		System.out.println("ÔÂ:" + (ca.get(Calendar.MONTH) + 1));
		
		Date date = new Date();
		SimpleDateFormat s = new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String d = s.format(date);
		System.out.println(d);
		
		String birthday = "2019-06-25 12:09:05";
		Date birdate = s.parse(birthday);
		System.out.println(s.format(birdate));
		
		
		System.out.println(Math.abs(-5));
		System.out.println(Math.ceil(3.8));
		System.out.println(Math.floor(-4.9));
		System.out.println(Math.round(3.3));
		System.out.println(Math.random());
		
		Random rand = new Random();
		System.out.println(rand.nextInt(6));
		
	}
}
