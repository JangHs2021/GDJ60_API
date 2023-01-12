package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever1 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		
		try {
			ss = new ServerSocket(8585);
			System.out.println("Client 접속을 기다리는 중");
			socket = ss.accept();
			System.out.println("Client와 연결 성공");
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String msg = br.readLine();
			System.out.println("Client : " + msg);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
