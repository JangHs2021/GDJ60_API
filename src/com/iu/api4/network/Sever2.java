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
import java.util.HashSet;
import java.util.Random;

public class Sever2 {

	public static void main(String[] args) {
		// Client 접속 대기
		// 보내온 숫자
		// 1. 점심메뉴중 하나를 랜덤하게 골라서 전송
		// 2. 저녁메뉴중 하나를 랜덤하게 골라서 전송
		// 3. 종료
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Random random = new Random();
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("피자");
		arr.add("햄버거");
		arr.add("라면");
		
		String menu = arr.get(random.nextInt(arr.size()));
		
		ArrayList<String> arr2 = new ArrayList<>();
		
		arr2.add("치킨");
		arr2.add("짬뽕");
		arr2.add("밥");
		
		String menu = arr2.get(random.nextInt(arr2.size()));
		
//		String [] lunch = {"피자", "햄버거", "라면"};
//		String [] dinner = {"치킨", "짬뽕", "밥"};
		
		boolean check = true;
		
		try {
			ss = new ServerSocket(8989);
			System.out.println("Client 접속을 기다리는 중");
			socket = ss.accept();
			System.out.println("Client와 연결 성공");
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(true) {
				String data = br.readLine();
				int select = Integer.parseInt(data);
				
				switch(select) {
				case 1 :
					bw.write(menu + "\r\n");
					bw.flush();
					break;
				case 2 :
					bw.write(menu + "\r\n");
					bw.flush();
					break;
				default :
					check = false;
				}
				
//				if(msg.equals("1")) {
//					bw.write(menu + "\r\n");
//					bw.flush();
//				} else if(msg.equals("2")) {
//					bw.write(menu2 + "\r\n");
//					bw.flush();
//				} else {
//					check = false;
//				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				socket.close();
				ss.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
