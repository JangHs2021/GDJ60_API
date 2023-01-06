package com.iu.api1.strings.ex3;

public class WeatherView {
	
	// 2개의 메서드 생성
	
	// 1. 모든 날씨 정보를 출력
	public void view(WeatherDTO [] weatherDTO) {
		for(int i = 0; i < weatherDTO.length; i++) {
			this.view(weatherDTO[i]);
		}
	}
	
	
	// 2. DTO하나의 정보를 출력
	public void view(WeatherDTO weatherDTO) {
		System.out.println("======================");
		System.out.println("City : " + weatherDTO.getCity());
		System.out.println("Gion : " + weatherDTO.getGion());
		System.out.println("Status : " + weatherDTO.getStatus());
		System.out.println("Mise : " + weatherDTO.getMise());
	}
}
