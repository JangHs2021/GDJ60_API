package com.iu.api2.Collections.ex1;

import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87");
		sb.append("choa, 4, 71, 25, 99");
	}
	
	// 학생 정보 초기화
	public void init() {
		String data = this.sb.toString();
		System.out.println(data);
//		StringTokenizer stringTokenizer = new StringTokenizer(data);
		
		
		
	}
}
