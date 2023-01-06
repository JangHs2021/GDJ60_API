package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	Scanner sc = new Scanner(System.in);
	// search 메서드
	// weather 배열을 받고, 키보드로부터 검색할 도시명을 입력 받음
	// 찾은 DTO 리턴, 없으면 null;
	// 검색한 단어 대소문자 상관 x
	public WeatherDTO search(WeatherDTO [] weatherDTOs) {
		System.out.print("검색할 도시명 입력 : ");
		String cityName = sc.next().toLowerCase();
		
		for(int i = 0; i < weatherDTOs.length; i++) {
			if(cityName.equals(weatherDTOs[i].getCity())) {
				return weatherDTOs[i];
			}
		}
		return null;
	}
	
	// add 메서드
	// weather 배열을 받고, 키보드로부터 정보들을 입력 받음
	// 배열에 추가하고 배열을 리턴
	public WeatherDTO [] add(WeatherDTO [] weatherDTOs) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.print("도시명 : ");
		weatherDTO.setCity(sc.next());
		System.out.print("기온 : ");
		weatherDTO.setGion(sc.next());
		System.out.print("날씨 : ");
		weatherDTO.setStatus(sc.next());
		System.out.print("미세먼지 : ");
		weatherDTO.setMise(sc.next());
		
		WeatherDTO [] newWeatherDTOs = new WeatherDTO[weatherDTOs.length + 1]; 
		for(int i = 0; i < weatherDTOs.length; i++) {
			newWeatherDTOs[i] = weatherDTOs[i];
		}
		
		newWeatherDTOs[weatherDTOs.length] = weatherDTO;
		
		return newWeatherDTOs;
	}
	
	// remove
	// 배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	// 배열에서 삭제하고 배열을 리턴
	public WeatherDTO [] remove(WeatherDTO [] weatherDTOs) {
		System.out.print("삭제할 도시명 : ");
		String remove = sc.next();
		int idx = 0;
		
		WeatherDTO [] removeWeatherDTOs = new WeatherDTO[weatherDTOs.length - 1];
		for(int i = 0; i < weatherDTOs.length; i++) {
			if(remove.equals(weatherDTOs[i].getCity())) {
				continue;
			} 
			removeWeatherDTOs[idx] = weatherDTOs[i];
			idx++;
		}
		
		weatherDTOs = removeWeatherDTOs;
		
		return removeWeatherDTOs;
	}
}
