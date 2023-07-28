package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		/*
			요구사항
			이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
			
			입력..
			이메일: hong@gmail.com 
			
			출력..
			아이디: hong
			도메인: gmail.com 
		 */
		int index = -1; //설정값 주의
		
		Scanner scan = new Scanner(System.in);

		System.out.print("이메일: ");
		String input = scan.nextLine();
		
		index= input.indexOf("@");
		
		System.out.print("아이디: " + input.substring(0, index));
		System.out.println();
		System.out.print("도메인: " + input.substring(index+1));
	}
}
