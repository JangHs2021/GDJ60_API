package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.1.126", 8686);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		// 번호 ? data
		bw.write("1:\r\n");
		bw.flush();
		
		// 응답
		String str = br.readLine();
		System.out.println(str);
	}
}
