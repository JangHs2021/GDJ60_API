package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;

public class Sever2 {

	public static void main(String[] args) {
		// Client 접속 대기
		// 보내온 숫자
		// 1. 점심메뉴중 하나를 랜덤하게 골라서 전송
		// 2. 저녁메뉴중 하나를 랜덤하게 골라서 전송
		// 3. 종료
		Calendar ca = Calendar.getInstance();
		Random random = new Random(ca.getTimeInMillis());
		String [] lunch = {"라면", "햄버거", "짬뽕", "짜장면"};
		int idx = random.nextInt(5);
		
		String menu = lunch[idx];
		
		
	}
}
