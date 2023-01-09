package com.iu.api1.wrappers.ex1;

public class JuminCheck {
	
	// check1 메서드
	// 주민등록번호를 받기 메인
	// 남자인지 여자인지 출력
	// 리턴 X
	public void check1(String num) {
		String check = num.substring(7, 8);
		
		if(check.equals("1") || check.equals("3")) {
			System.out.println("남자입니다");
		} else {
			System.out.println("여자입니다");
		}
	}
	
	
	// check2 메서드
	// 주민등록번호를 받기 메인
	// 나이를 계산해서 출력
	// 태어난 달 계절 출력
	// 3월 - 5월 : 봄 
	// 6월 - 8월 : 여름
	// 9월 - 11월 : 가을
	// 12월 - 2월 : 겨울
	public void check2(String num) {
		String y = num.substring(0,2);
		String check = num.substring(7, 8);
		int year = 1900;
		
		if(check.equals("3") || check.equals("5")) {
			year = 2000;
		}
		
		year = year + Integer.parseInt(y);
		int age = 2023 - year;
		System.out.println("나이 : " + age);
		
		String s = num.substring(2,4);
		int month = Integer.parseInt(s);
		
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if(month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if(month >= 9 && month <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
		
//		if(s.equals("03") || s.equals("04") || s.equals("05")) {
//			System.out.println("봄");
//		}else if(s.equals("06") || s.equals("07") || s.equals("08")) {
//			System.out.println("여름");
//		}else if (s.equals("09") || s.equals("10") || s.equals("11")) {
//			System.out.println("가을");
//		} else {
//			System.out.println("겨울");
//		}
	}
}
