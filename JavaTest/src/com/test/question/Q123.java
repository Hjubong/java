package com.test.question;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		
		/*
			이름을 입력받아 회원 정보를 검색 후 출력하시오.
			
			입력..
			이름: 홍길동 
			
			출력..
			[홍길동] 
			번호: 33 
			주소: 서울시 강남구 역삼동 
			전화: 010-2345-6789  
		 */
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\juju8\\OneDrive\\바탕 화면\\새 폴더 (2)\\단일검색.dat"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			
			String name = scan.nextLine();
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if(temp[1].equals(name)) {
					System.out.printf("[%s]\n 번호: %s\n 주소: %s\n 전화: %s\n" , temp[1], temp[0], temp[2], temp[3]);
					break;
				}
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
