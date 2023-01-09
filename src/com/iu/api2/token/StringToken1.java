package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		String nations = "Korea,서울,Usa,워싱턴,Uk,런던,Japan,도쿄";
//		String [] n = nations.split(",");
		StringTokenizer st = new StringTokenizer(nations, ",");
		
		while(st.hasMoreTokens()) {
			NationDTO nationDTO = new NationDTO();
			
			String t1 = st.nextToken();
			nationDTO.setName(t1);
			
			String t2 = st.nextToken();
			nationDTO.setCity(t2);
		}
	}
}
