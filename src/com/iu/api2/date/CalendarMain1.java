package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		// GregorianCalendar
		Calendar ca = new GregorianCalendar();
		// 현재 날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		
		ca.set(ca.YEAR, 2032);
		ca.set(ca.MONTH, 11);
		ca.set(0, 0, 0);
		
		System.out.println(ca);
		
		// year
		int year = ca.get(Calendar.YEAR);
		// 월은 0부터 시작
		int month = ca.get(Calendar.MONTH);
		// 일
		int date = ca.get(Calendar.DATE);
		// 일월화수목금토
		// 1234567
		int day = ca.get(Calendar.DAY_OF_WEEK);
		// 시
		int hour = ca.get(Calendar.HOUR);
		// 분
		int minute = ca.get(Calendar.MINUTE);
		// 초
		int second = ca.get(Calendar.SECOND);
		
		System.out.println("Year : " + year);
		System.out.println("Month : " + (month + 1));
		System.out.println("Date : " + date);
		System.out.println("Day : " + day);
		System.out.println("Hour : " + hour);
		System.out.println("Minute : " + minute);
		System.out.println("Second : " + second);
	}
}
