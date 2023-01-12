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
import java.util.Scanner;

public class Sever1 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		String msg = null;
		
		
		boolean check = true;
		
		try {
			ss = new ServerSocket(8989);
			System.out.println("Client 접속을 기다리는 중");
			socket = ss.accept();
			System.out.println("Client와 연결 성공");
			
			while(check) {
				
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				
				msg = br.readLine();
				
				if(msg.toLowerCase().equals("q")) {
					check = false;
				} 
				
				System.out.println("Client : " + msg);
				
				System.out.println("Client 보낼 메세지 입력");
				msg = sc.next();
				
				bw.write(msg + "\r\n");
				bw.flush();
				
				if(msg.toLowerCase().equals("q")) {
					check = false;
				}
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
