package com.test.question;

import java.util.Scanner;

public class Q026 {

	public static void main(String[] args) {
		
		/*
		  요구사항
			학생의 국어 점수를 입력받아 성적을 출력하시오.

			조건..
			90 ~ 100: A
			80 ~  89: B
			70 ~  79: C
			60 ~  69: D
 			0 ~   59: F
			유효성 검사를 하시오.(점수: 0 ~ 100점 이내)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int score = scan.nextInt();
		String grade ="";
		
		if (score <= 100 && score >= 0) {
		 if (score >= 90) {
			 
			 grade = "A";
			 
		 } else if (score >= 80) {
			 
			 grade = "B";
			 
		 } else if (score >= 70) {
			 
			 grade = "C";
			 
		 } else if (score >= 60) {
			 
			 grade = "D";
			 
		 } else {
			 
			 grade = "F";
		 }
		 
		 System.out.printf("입력한 %d점은 성적 %s입니다."
				 
				 			, score, grade);
		 
		} else {
			
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
	  }
		
		
	}//main
}
