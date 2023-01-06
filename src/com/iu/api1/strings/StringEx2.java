package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next(); // asdad.jpg
		String result = fileName.substring(fileName.lastIndexOf(".") + 1);
//		System.out.println(result);
		
		boolean flag = true;
		for(int i = 0; i < names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("정상 파일입니다");
				flag = false;
				break;
			} 
		}
		if(flag) {
			System.out.println("잘못된 파일입니다");
		}
	}
}
