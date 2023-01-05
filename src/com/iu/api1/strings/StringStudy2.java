package com.iu.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "ab@c1@23@gmail.com";
		
//		int idx = email.lastIndexOf("@");
//		System.out.println(idx);
		
		for(int i = 0; i < email.length(); i++) {
			System.out.println(email.charAt(i));
		}
	}
}
