package com.iu.api2.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		hs.remove(1);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		// set의 데이터들을 Iterator 형식으로 변경
		Iterator<Integer> iterator = hs.iterator();
		
		while(iterator.hasNext()) {
			Integer num = iterator.next();
			System.out.println(num);
		}
	}
}
