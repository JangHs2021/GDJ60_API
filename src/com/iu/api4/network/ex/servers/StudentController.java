package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class StudentController {
	private ServerSocket ss;
	private Socket socket;
	private StudentDAO studentDAO;
	
	public void start() throws Exception {
		
		ss = new ServerSocket(8686);
		socket = ss.accept();
		
		studentDAO = new StudentDAO();
		ArrayList<StudentDTO> ar = studentDAO.init();
		
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
		boolean check = true;
		
		while(check){
			String select = br.readLine(); // 선택번호 ? data
			
			String [] s = select.split(":");
			
			switch (s[0]) {
			case "1": 
				select = studentDAO.makeList(ar);
				break;
			case "2" :
				
				break;
			default:
				check = false;
			}
			
			if(check) {
				bw.write(select + "\r\n");
				bw.flush();
			}
		}
	}
}
