package com.test.question;

import java.util.Scanner;

public class Q045 {

	public static void main(String[] args) {
		/*
		요구사항
		사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.

		조건..
		최대 3자리까지만 입력하시오.
		입력..
		최대 숫자: 50 

		출력..
		1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
		21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 
		41 42 짝 44 45 짝 47 48 짝 50
		*/
		
		//문자열로 받아서 문자 배열로 3 6 9 자체를 짝으로 변환 하는 방법도 있음
		
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 숫자: ");
		max = scan.nextInt();
		
		if (max < 1000) {
			
			for(int i=1; i<=max; i++) {
				
				System.out.print(checkClap(i) + " ");
			}
			
			System.out.println();
			
		} else {
			
			System.out.print("1000이하만 가능합니다.");
			
		}
	}	
		private static String checkClap(int i) {
			
			String temp = "";
			int n = i;
			
			for(; n>0;) {
				
				if(n % 10 % 3 == 0 && n % 10 !=0) {
					temp += "짝";
				}
				
				n/=10;
			}
			
			if(temp.equals("")) {
				
				return i + "";
			} else {
				
				return temp;
			}
		
		
	}//main
}
