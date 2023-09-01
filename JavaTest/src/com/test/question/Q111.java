package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		/*
			조건..
			확장자 대소문자 구분없이 검색 가능
			입력..
			폴더: C:\class\eclipse 
			
			확장자: exe 
			
			출력..
			eclipse.exe 
			eclipsec.exe
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더 선택: ");
		String path = scan.nextLine();
		
		System.out.print("파일 확장자: ");
		String extension = scan.nextLine();
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for(File file : list) {
			if(file.getName().endsWith(extension.toLowerCase())) {
				System.out.println(file.getName());
			}
		}
	}
}
//.toLowerCase()