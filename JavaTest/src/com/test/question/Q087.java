package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
		
		/*
			요구사항
			영단어를 입력받아 분리하시오.
			
			조건..
			합성어를 입력한다.
			합성어는 파스칼 표기법으로 입력한다.
			출력은 각 단어를 공백으로 구분한다.
			
			입력..
			단어: StudentName 
			
			출력..
			결과: Student Name 
		 */

		String word = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("합성어: ");
		word = scan.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			
			char c = word.charAt(i);
			
			if(c>='A' && c<='Z' && i !=0) {
				System.out.print(" ");
			}
			
			System.out.print(c);
		}
	}
}
