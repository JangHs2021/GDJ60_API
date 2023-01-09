package com.iu.api1.strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	private String data;
	
	public WeatherData() {
		// 지역,기온,날씨,미세먼지농도
		this.data = "Seoul,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,Junju,32,흐림,5"; 
	}
	
	// 메서드명 init
	// data에 있는 문자열 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴 // 4개를 리턴
	public WeatherDTO [] init() {
		StringTokenizer st = new StringTokenizer(data, ",");
		WeatherDTO [] weathers = new WeatherDTO[st.countTokens() / 4];
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			WeatherDTO dto = new WeatherDTO();
			
			dto.setCity(st.nextToken());
			dto.setGion(Integer.parseInt(st.nextToken()));
			dto.setStatus(st.nextToken());
			dto.setMise(Integer.parseInt(st.nextToken()));

			weathers[idx] = dto;
			idx++;
		}
		return weathers;
	}
	
//	public WeatherDTO [] init() {
//		String [] datas = this.data.toLowerCase().split(",");
//		WeatherDTO [] weathers = new WeatherDTO[datas.length / 4];
//		int idx = 0;
//		
//		for(int i = 0; i < datas.length; i = i + 4) {
//			WeatherDTO dto = new WeatherDTO();
//			dto.setCity(datas[i]);
//			dto.setGion(Integer.parseInt(datas[i + 1]));
//			dto.setStatus(datas[i + 2]);
//			dto.setMise(Integer.parseInt(datas[i + 3]));
//			
//			weathers[idx] = dto;
//			idx++;
//		}
//		return weathers;
//	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
