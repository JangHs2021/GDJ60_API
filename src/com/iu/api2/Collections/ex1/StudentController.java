package com.iu.api2.Collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private Scanner sc;
	// 의존성
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	public StudentController() {
		sc = new Scanner(System.in);
		studentDAO = new StudentDAO(); // 주입
		studentView = new StudentView();
	}
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보검색조회");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제");
			System.out.println("6.학생정보백업");
			System.out.println("7.프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = studentDAO.init();
				break;
			case 2:
				studentView.view(ar);
				break;
			case 3:
				StudentDTO studentDTO = studentDAO.findByName(ar);
				if(studentDTO != null) {
					studentView.view(studentDTO);
				} else {
					studentView.view("찾는 학생이 없다");
				}
				break;
			case 4:
				studentDAO.addStudent(ar);
				break;
			case 5:
				select = studentDAO.removeStudent(ar);
				if(select == 1) {
					studentView.view("삭제 성공");
				} else {
					studentView.view("삭제 실패");
				}
				break;
			case 6:
				studentDAO.backUp(ar);
				break;
			default:
				check = false;
				break;
			}
		}
	}
}
