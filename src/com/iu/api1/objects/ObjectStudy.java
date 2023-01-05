package com.iu.api1.objects;

public class ObjectStudy {

	public static void main(String[] args) {
		// 객체 생성 공식
		Object object = new Object();
		
		int s = object.hashCode();
		System.out.println(s);
		
		String a = object.toString();
		System.out.println(a);
		System.out.println(object);
		
		Child child = new Child();
		Object object2 = new Object();
		System.out.println(object == object2);
		boolean check = object.equals(object2);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());
		
		Object o = child; // 다형성 // object는 모든 클래스의 부모
	}
}
