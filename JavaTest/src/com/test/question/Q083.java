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
		int Mp3 = 0;
		int Jpg = 0;
		int Java = 0;
		int Hwp = 0;
		int Doc = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			
			System.out.println("파일명: ");
			String file = scan.nextLine();
			
			file = file.toLowerCase();
			
			if(file.endsWith(".mp3")) {
				Mp3++;
			} else if(file.endsWith(".jpg")) {
				Jpg++;
			} else if(file.endsWith(".java")) {
				Java++;
			} else if(file.endsWith(".hwp")) {
				Hwp++;
			} else if(file.endsWith(".doc")) {
				Doc++;
			}
					
		}
		
		System.out.printf("mp3: %d개\n", Mp3);
		System.out.printf("jpg: %d개\n", Jpg);
		System.out.printf("java: %d개\n", Java);
		System.out.printf("hwp: %d개\n", Hwp);
		System.out.printf("doc: %d개\n", Doc);
		
	}
}
