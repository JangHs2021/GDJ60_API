package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		// 1. 서버 접속 시도
		// 2. 1.점심  2.저녁  3.종료
		// 3. 1,2,3선택
		// 1번 : 서버에서 점심메뉴중 하나를 보내줌, 출력
		// 2번 : 서버에서 저녁메뉴중 하나를 보내줌, 출력
		// 3번 : 종료
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("192.168.1.126", 9595);
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(true) {
				System.out.println("1.점심 2.저녁 3.종료");
				int select = sc.nextInt();
				
				bw.write(select + "\r\n");
				bw.flush();
				
				if(select == 3) {
					System.out.println("프로그램 종료");
					break;
				}
				String menu = br.readLine();
				System.out.println("Menu : " + menu);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
