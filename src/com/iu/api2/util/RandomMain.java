package com.iu.api2.util;

import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		while(hashSet.size() < 6) {
			hashSet.add(random.nextInt(45) + 1);
		}
		System.out.println(hashSet);

		// 1000원 로또 구매 1 - 45 
		// 번호 6개 랜덤하게 추출 중복 x
//		for(int i = 0; i < 6; i++) {
//			hashSet.add(random.nextInt(45) + 1);
//		}
//		System.out.println(hashSet);
	}
}
