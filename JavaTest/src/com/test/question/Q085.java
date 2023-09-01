package com.test.question;

import java.util.Scanner;

public class Q085 {

	public static void main(String[] args) {
		
		/*
			요구사항
			주민 등록 번호 유효성 검사를 하시오.
			
			조건..
			'-'의 입력 유무 상관없이 검사하시오.
			입력..
			주민등록번호: 951220-1021547 
			
			출력..
			올바른 주민등록번호입니다.
			
			700101-101010 4(유효성 검사위해 빼둠)
			X
			234567 8923456
			---------------
			14  5 7  9 3 5 = 40
			
			40%11 = 7
			11-7 =4
			
			11-1 = 10>0   10자리 버리고 1자리만 사용
		 */
		
		String jumin = "";
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호: ");
		jumin = scan.nextLine();
		
		jumin = jumin.replace("-", "");
		
		
	}
}
