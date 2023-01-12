package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
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
		
		String msg = null;
		boolean check = true;
		
		while(check) {
			try {
				socket = new Socket("192.168.1.126", 8989);
				System.out.println("1.점심  2.저녁  3.종료");
				String select = sc.next();
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);	
				
				if(select.equals("1")) {
					System.out.println("1번 선택");
					bw.write(select + "\r\n");
					bw.flush();
					
					msg = br.readLine();
					System.out.println("점심메뉴 : " + msg);
					
				} else if(select.equals("2")) {
					System.out.println("2번 선택");
					bw.write(select + "\r\n");
					bw.flush();
					
					msg = br.readLine();
					System.out.println("저녁메뉴 : " + msg);
					
				} else {
					System.out.println("시스템 종료");
					check = false;
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
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
