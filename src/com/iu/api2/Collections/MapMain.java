package com.iu.api2.Collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		// 데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k2", "v2Re");
		
		// 데이터 조회
		String v = map.get("k3");
		// 삭제
		v = map.remove("k2");
		// 전체 삭제
//		map.clear();
		
		boolean check = map.containsKey("k1");
		System.out.println(check);
		
		boolean check2 = map.containsValue("v7");
		System.out.println(check2);
		
		// 반복
		// 1. Key들의 정보를 알아야함
		// Key들을 Set으로 변환
		// Set을 Iterator로 변환
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : " + key);
			String value = map.get(key);
			System.out.println("Value : " + value);
		}
		
//		System.out.println(v);
//		System.out.println(map);
	}
}
