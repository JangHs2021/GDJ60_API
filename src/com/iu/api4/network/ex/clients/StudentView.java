package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentView {
	Socket socket = null;
	
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	ArrayList<String> ar = new ArrayList<>();
	
	public ArrayList<String> pacing(String data) {
		try {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			String student = br.readLine();
			StringTokenizer st = new StringTokenizer(student, "-");
			ArrayList<StudentDTO> ar = new ArrayList<>();
			
			while((student = br.readLine()) != null) {
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(st.nextToken());
				studentDTO.setNum(Integer.parseInt(st.nextToken()));
				studentDTO.setKor(Integer.parseInt(st.nextToken()));
				studentDTO.setEng(Integer.parseInt(st.nextToken()));
				studentDTO.setMath(Integer.parseInt(st.nextToken()));
					
				studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
				studentDTO.setAvg(studentDTO.getTotal() / 3.0);
				ar.add(studentDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ar;
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println("Name : " + studentDTO.getName());
		System.out.println("Num : " + studentDTO.getNum());
		System.out.println("Kor : " + studentDTO.getKor());
		System.out.println("Eng : " + studentDTO.getEng());
		System.out.println("Name : " + studentDTO.getMath());
		System.out.println("Total : " + studentDTO.getTotal());
		System.out.println("Avg : " + studentDTO.getAvg());
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(StudentDTO studentDTO : ar) {
			this.view(studentDTO);
		}
	}
}
