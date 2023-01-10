package com.iu.api2.Collections.sample;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		// *
		ArrayList<Parent> ar = new ArrayList<>();
		ar.add(child1);
		ar.add(child2);
		
//		Child1 ch1 = (Child1)ar.get(0);
		
		System.out.println(ar.get(0) instanceof Child2);
		
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		
		ArrayList<? super Parent> ar3 = new ArrayList<>();
		
	}
}
