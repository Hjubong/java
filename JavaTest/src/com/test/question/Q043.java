package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {
		/*
			요구사항
			컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
			
			조건..
			시도 횟수가 10회가 넘어가면 프로그램을 종료하시오. 
		 */
		int i = 1;
		int input = 0;
		int comnum = 0;
		
		comnum = (int)(Math.random() * 10 + 1); //1~10 사이의 난수
		System.out.print("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		for(i=1; i<=10; i++) {
			System.out.print("숫자:");
			input = scan.nextInt();
			
			if(input == comnum) {
				System.out.print("맞았습니다.\n");
				break; //꼭 넣어줘야 다음 문장 출력가능
			} else {
				System.out.print("틀렸습니다.");
			}
			
			System.out.println();
			
		}
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", comnum);
		
		if(input == comnum) {
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회 입니다..\n", i);
		} else {
			System.out.print("모든 기회를 실패하셨습니다.");
		} 
		
		System.out.println();
		System.out.print("프로그램을 종료합니다.");
		
		
	}//main
}
