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
import java.util.Scanner;

public class StudentDAO {
	Socket socket = null;

	Scanner sc = new Scanner(System.in);
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	
	public void findByName() {
		System.out.print("학생 이름과 번호: ");
		String nameNum = sc.next();
		
		try {
			bw.write(nameNum + "\r\n");
			bw.flush();
			
			nameNum = br.readLine();
			System.out.println("결과 : " + nameNum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력: ");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력: ");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 입력: ");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 입력: ");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 입력: ");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal() / 3.0);
		ar.add(studentDTO);
		
		try {
			bw.write(studentDTO + "\r\n");
			bw.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeStudent(ArrayList<StudentDTO> ar) {
		int result = 0;
		
		System.out.println("삭제할 학생 이름 : ");
		String name = sc.next();

		try {
			for(StudentDTO studentDTO : ar) {
				if(name.equals(studentDTO.getName())) {
					ar.remove(studentDTO);
					result = 1;
					bw.write("삭제 성공" + "\r\n");
					bw.flush();
					break;
				} else {
					bw.write("삭제 실패" + "\r\n");
					bw.flush();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
