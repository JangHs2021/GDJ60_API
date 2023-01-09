package com.iu.api1.wrappers;

public class Wrapper2 {

	public static void main(String[] args) {
		int num = 10;
		
		// Integer num2 = new Integer(num);
		// Auto-Boxing
		// Primitive -> reference
		Integer num2 = num;
		
		// num = num2.intValue();
		// Auto-UnBoxing
		// Reference -> Primitive
		num = num2;
	}
}
