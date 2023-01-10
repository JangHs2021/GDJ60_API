package com.iu.api2.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>(); 
		ars.add(ar1);
		ars.add(ar2);
		
		ars.get(0).get(0);
		
		ArrayList<ArrayList<ArrayList<Integer>>> arrs = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("k1", ar1);
		map.put("k2", ar2);
		
	}
}
