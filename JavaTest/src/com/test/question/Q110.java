package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		/*
			조건..
			파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
			입력..
			파일 경로 : D:\class\java\file\test.txt 
			
			출력..
			파일명 : test.txt 
			종류 : txt 파일 
			파일 크기 : 45B 
		*/
		
		Scanner scan = new Scanner(System.in);

		System.out.print("파일 경로: ");
		String path = scan.nextLine();

		File file = new File(path);

		System.out.printf("파일명: %s\n", file.getName());
		System.out.printf("종류: %s 파일\n", file.getName().substring(file.getName().lastIndexOf(".") + 1));
		System.out.printf("파일 크기: %s\n", getSize(file.length()));
	}

	private static Object getSize(long length) {

		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return String.format("%.1f", length / 1024.0) + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0) + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0) + "GB";
		} else {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0 / 1024.0) + "TB";
		}
	}

}
