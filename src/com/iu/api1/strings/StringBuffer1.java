package com.iu.api1.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		// hello + world
		sb.append("world");
		
		System.out.println(sb);
		
		// 참조변수를 호출하면 toString() : 클래스명@객체주소
		// toString을 오버라이딩 했음
		// 변수에는 같은 데이터타입만 대입 가능
		String str = sb.substring(0);
		
		str = sb.toString();
		
		System.out.println(str);
		
		sb.reverse();
		System.out.println(sb);
		
		str = String.valueOf("abc" + 10);
		
		System.out.println(str);
	}
}
