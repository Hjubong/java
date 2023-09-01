package com.test.question;

import java.io.File;

public class Q117 {
	
	static int count = 0;
	static int dcount = 0;

	public static void main(String[] args) {
		
		//내용있는 폴더 삭제하기
		
		File dir = new File("C:\\Users\\user\\Desktop\\새 폴더\\폴더 삭제\\delete");
		
		//탐색
		delete(dir);
		
		System.out.printf("삭제된 파일은 %d개이고, 폴더는 %d개입니다.", count, dcount);
		
		System.out.println("종료");
	}

	private static void delete(File dir) {

		File[] list = dir.listFiles();
		
		
		
		for(File f : list) {
			if(f.isFile()) {
				f.delete();
				
				count++;
			}
		}
		
		for(File d : list) {
			if(d.isDirectory()) {
				delete(d);
				
				dcount++;
			}
		}
		
		dir.delete();
		
		
	}
}
