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

public class Client1 {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		String msg = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		boolean check = true;
		
		// q를 누르면 종료
		try {
			// 객체 생성시 서버 접속 시도
			socket = new Socket("192.168.1.126", 8989);
			System.out.println("Sever 접속 성공");
			
			while(check) {
				// 0, 1
				os = socket.getOutputStream();
				// char
				ow = new OutputStreamWriter(os);
				// Stream
				bw = new BufferedWriter(ow);
				
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);	
				
				System.out.println("Sever 보낼 메세지 입력");
				msg = sc.next();
				
				bw.write(msg + "\r\n");
				bw.flush();
				
				if(msg.toLowerCase().equals("q")) {
					check = false;
				} 
				
				msg = br.readLine();
				
				if(msg.toLowerCase().equals("q")) {
					check = false;
				}
				
				System.out.println("Sever : " + msg);

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
