package com.test.question;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {
		
		/*
			파일의 크기가 0byte인 파일만 삭제하시오.
			
			출력..
			총 34개의 파일을 삭제했습니다. 
		 */
		
		
		String path = "C:\\Users\\juju8\\OneDrive\\바탕 화면\\새 폴더\\파일 제거";
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		int count = 0;
		
		for(File file : list) {
			if(file.length() == 0) {
				file.delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n", count);
	}
}
