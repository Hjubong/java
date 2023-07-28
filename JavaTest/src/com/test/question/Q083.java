package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		
		/*
			요구사항
			파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
			
			입력..
			파일명: 인기가요.mp3 
			파일명: cat.jpg 
			파일명: Ex01.java 
			파일명: icon.jpg 
			파일명: 수업_정리.doc 
			파일명: Scanner.java 
			파일명: food.jpg 
			파일명: 공지사항.hwp 
			파일명: 이력서.hwp 
			파일명: 출금내역.doc 
			
			출력..
			mp3 : 1개
			jpg : 3개
			java : 2개
			hwp : 2개
			doc : 2개
		 */
		String input = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("파일명: ");
			input = scan.nextLine();
		}
		
	}
}
