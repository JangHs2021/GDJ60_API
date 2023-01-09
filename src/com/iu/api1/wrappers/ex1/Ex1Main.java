package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력"); // 991234-1234567
		String num = sc.next();
		
		JuminCheck juminCheck = new JuminCheck();
		
//		System.out.println(num.lastIndexOf("-"));
//		juminCheck.check1(num);
//		
//		juminCheck.check2(num);
		
		JuminCheck2 juminCheck2 = new JuminCheck2();
		juminCheck2.check(num);
	}
}
