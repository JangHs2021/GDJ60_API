package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
//	private Scanner sc;
//	private WeatherData wd;
//	private WeatherView weatherView;
//	private WeatherInput weatherInput;
//	private WeatherDTO [] weatherDTOs;
//	
//	public WeatherController() {
//		new Scanner(System.in);
//		new WeatherData();
//		new WeatherView();
//		new WeatherInput();
//		wd.init();
//	}
	
	// Start
	// 1. 날씨정보초기화 // init() 호출 // 메시지 초기화 완료 출력
	// 2. 전국날씨정보 // view() 호출
	// 3. 지역날씨검색 // 리턴 받아서 뷰로 보내기 // 있으면 날씨정보 출력 없으면 도시정보가 없습니다 출력
	// 4. 지역날씨추가 // input
	// 5. 지역날씨삭제 // input
	// 6. 종	료
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		WeatherData wd = new WeatherData();
		WeatherData weatherData = new WeatherData();
		WeatherView weatherView = new WeatherView();
		WeatherInput weatherInput = new WeatherInput();
		WeatherDTO [] weatherDTOs = wd.init();
		
		while(check) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종 료");
			System.out.println("======================");
			int select = sc.nextInt();
			
			if(select == 1) {
				
				weatherData.init();
				System.out.println("초기화 완료");
				
			} else if(select == 2) {
				
				weatherView.view(weatherDTOs);
				
			} else if(select == 3) {
				
				WeatherDTO weatherDTO = weatherInput.search(weatherDTOs);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				} else {
					System.out.println("찾으시는 도시정보가 없습니다");
				}
				
			} else if(select == 4) {
				
				weatherDTOs = weatherInput.add(weatherDTOs);
				
			} else if(select == 5) {
				
				weatherDTOs = weatherInput.remove(weatherDTOs);
				
			} else {
				
				check = false;
				
			}
		}
		
	}
}
