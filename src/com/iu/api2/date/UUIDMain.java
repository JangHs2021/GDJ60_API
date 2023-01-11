package com.iu.api2.date;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class UUIDMain {

	public static void main(String[] args) {
		String name = UUID.randomUUID().toString();
		System.out.println(name);
		
		Calendar calendar = Calendar.getInstance();
		name = calendar.getTimeInMillis() + "abc";
		
		Random random = new Random(calendar.getTimeInMillis());
		
	}
}
