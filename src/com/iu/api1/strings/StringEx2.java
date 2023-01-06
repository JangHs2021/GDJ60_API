package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next(); // asdad.jpg
		
		// 확장자 분리 작업
//		int idx = fileName.lastIndexOf(".");
//		String result = fileName.substring(idx + 1);
//		System.out.println(result);
		String result = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(result);
		
		boolean flag = true;
		// 확장자가 이미지인지 검증
		for(int i = 0; i < names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("정상 파일");
				// i = names.length;
				flag = false;
				break;
			} 
		}
		if(flag) {
			System.out.println("비정상 파일입니다");
		}
		System.out.println("Finish");
	}
}
