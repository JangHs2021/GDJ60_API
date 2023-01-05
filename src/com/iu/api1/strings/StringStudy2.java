package com.iu.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "ab@c1@23@gmail.com";
		
//		int idx = email.lastIndexOf("@");
//		System.out.println(idx);
		
		for(int i = 0; i < email.length(); i++) {
			System.out.println(email.charAt(i));
		}
		
		System.out.println("Before Email : " + email);
		email = email.replaceAll("@", "_");
		System.out.println("After Email : " + email);
		
		
		String str = " a";
		String str2 = "a";
		String str3 = null; // error
		System.out.println("STR : " + str.length());
		System.out.println("STR : " + str2.length());
	}
}
