package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy3 {

	public static void main(String[] args) {
		Object object = new Object();
		Scanner sc = new Scanner(System.in);
		// String 불변
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
		
		str1 = str1 + "word" + str2;
		System.out.println(str1);
	}
}
