package com.iu.api2.util;

import java.util.ArrayList;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
//		int [] nums = new int[6];
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size() < 6) {
			int n = random.nextInt(45) + 1;
			boolean check =true;
			
			for(int i = 0; i < ar.size(); i++) {
				if(n == ar.get(i)) {
					check = false;
					break;
				}
			}
			
			if(check) {
				ar.add(n);
			}
		}
		
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = random.nextInt(45) + 1;
//			for(int j = 0; j < i; j++) {
//				if(nums[i] == nums[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
	}
}
