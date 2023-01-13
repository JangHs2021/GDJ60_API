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
import java.util.StringTokenizer;

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
		

		try {
			socket = new Socket("192.168.1.126", 8888);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
				
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			boolean check = true;
			
			while(check) {
				System.out.println("1.전체학생정보");
				System.out.println("2.학생정보검색");
				System.out.println("3.학생정보추가");
				System.out.println("4.학생정보삭제");
				System.out.println("5.프로그램 종료");
				System.out.print("번호 입력 : ");
				int select = sc.nextInt();
				
				if(select == 1) {
					bw.write(select + "\r\n");
					bw.flush();
					
					String data = br.readLine();
					data = data.replace(" ", "");
					data = data.replace(",", "-");
					
					StringTokenizer st = new StringTokenizer(data, "-");
					ArrayList<StudentDTO> ar = new ArrayList<>();
					StudentDTO studentDTO = new StudentDTO();
					
					while((data = br.readLine()) != null) {
						studentDTO.setName(st.nextToken());
						studentDTO.setNum(Integer.parseInt(st.nextToken()));
						studentDTO.setKor(Integer.parseInt(st.nextToken()));
						studentDTO.setEng(Integer.parseInt(st.nextToken()));
						studentDTO.setMath(Integer.parseInt(st.nextToken()));
							
						studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
						studentDTO.setAvg(studentDTO.getTotal() / 3.0);
						ar.add(studentDTO);
						
						System.out.println(ar.get(0).getName());
						
					}
					
//					for(int i = 0; i < ar.size(); i++){
//						studentView.view(studentDTO);
//					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
}
