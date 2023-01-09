package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {
	// check 메서드
	// 주민등록번호를 받기 메인
	// 991224-1234567 
	// 맨 끝자리는 체크용 번호로 뺌 7
	// 9	8	0	7	2	4 -	1	2	3	4	5	6
	// 2	3	4	5	6	7	8	9	2	3	4	5
	// 18	24	0	35	12	28	8	18	6	12	20	30 =>
	// ex) 총 합 : 122 , 합을 11로 나누어서 나머지구함
	// ex) 122 / 11 = 몫: 11, 나머지: 1
	// 나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	// 11 - 1 = 10
	// 11로 뺀 결과값이 두자리면
	// 11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	// 10 / 10 몫: 1, 나머지:0  || 0 == 7 ?
	
	public void check(String num) {
		int n = 2;
		int sum = 0;
		
		for(int i = 0; i < num.length() - 1; i++) {
			if(i == 6) {
				continue;
			}
			sum = sum + Integer.parseInt(String.valueOf(num.charAt(i))) * n;
//			sum = sum + Integer.parseInt(num.substring(i, i + 1)) * n;
			n++;
			if(n == 10) {
				n = 2;
			}
		}
		int result = 11 - sum % 11;
		
		if(result > 9) {
			result = result % 10;
		}
		
		int flag = Integer.parseInt(num.substring(13));
		if(result == flag) {
			System.out.println("정상");
		} else {
			System.out.println("비정상");
		}
	}
}
