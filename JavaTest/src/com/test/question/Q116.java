package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q116 {

	public static void main(String[] args) {
		
		/*
			MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
			
			조건..
			중복 파일을 찾아내시오.
			
			출력..
			BAAM - 모모랜드 (MOMOLAND).mp3 
			Dejavu - 볼빨간사춘기.mp3 
			SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\새 폴더\\동일 파일\\MusicA";
		String path2 = "C:\\Users\\user\\Desktop\\새 폴더\\동일 파일\\MusicB";
		
		File dir = new File(path);
		File dir2 = new File(path2);
		
		File[] list = dir.listFiles();
		File[] list2 = dir2.listFiles();
		
		ArrayList <File> dup = new ArrayList<File>();
		
		for(File file : list) {
			for(File file2 : list2) {
				if(file.getName().equals(file2.getName())) {
					dup.add(file);
				}
			}
		}
		
		for(File file3 : dup) {
			System.out.println(file3.getName());
		}
	}
}
