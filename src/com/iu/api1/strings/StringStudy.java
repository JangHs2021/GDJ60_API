package com.iu.api1.strings;

import java.util.Comparator;
import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abc";
		
		System.out.println(str == str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);
	
		char ch = str.charAt(2);
		System.out.println("Char : " + ch);
		
		Scanner sc = new Scanner(System.in);
//		ch = sc.next().charAt(0);
//		System.out.println("Char : " + ch);
		
		int num = str.indexOf('k', 3);
		System.out.println("Num : " + num);
	}
}
