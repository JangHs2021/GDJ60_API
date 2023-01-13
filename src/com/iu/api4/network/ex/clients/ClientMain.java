package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;

		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		StudentView studentView = new StudentView();
		StudentDAO studentDAO = new StudentDAO();
		ArrayList<StudentDTO> ar = new ArrayList<>();

		try {
			socket = new Socket("192.168.1.126", 8989);
			
			boolean check = true;
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
				
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			while(check) {
				System.out.println("1.전체학생정보");
				System.out.println("2.학생정보검색");
				System.out.println("3.학생정보추가");
				System.out.println("4.학생정보삭제");
				System.out.println("5.프로그램 종료");
				System.out.print("번호 입력 : ");
				int select = sc.nextInt();
				
				switch(select) {
				case 1 :
					bw.write(select);
					studentView.view(ar);
					break;
				case 2 :
					bw.write(select);
					studentDAO.findByName();
					String result = br.readLine();
					System.out.println("검색 결과 : " + result);
					break;
				case 3 :
					bw.write(select);
					studentDAO.addStudent(ar);
					break;
				case 4 :
					bw.write(select);
					studentDAO.removeStudent(ar);
					break;
				default :
					check = false;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
}
