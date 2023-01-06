package com.iu.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		WeatherDTO [] datas = wd.init();
		WeatherView weatherView = new WeatherView();
		WeatherController weatherController = new WeatherController();
		
//		for(int i = 0; i < datas.length; i++) {
//			System.out.println(datas[i].getCity());
//			System.out.println(datas[i].getStatus());
//		}
		
		weatherController.start();
//		new WeatherController().start();
	}
}
