package com.iu.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {
		String num = null;
		Random random = new Random();
		int n = random.nextInt(2);
		
		if(n == 0) {
			num = "test";
		}
		
		try {
			int a = 10;
			System.out.println(3 / n);			
//			throw new ArithmeticException();
			System.out.println(num.charAt(0));
			
			// 다형성
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외 발생");
			int a = 100;
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		} catch (Throwable e) {
			
		}
		
//		System.out.println(a);
		System.out.println("종료합니다");
	}
}
