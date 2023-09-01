package com.test.question;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Q114 {

	public static void main(String[] args) {
		
		/*
			이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
			
			조건..
			새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
			'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
			
			출력..
			*.gif: 10개 
			*.jpg: 5개 
			*.png: 3개  
		 */
		
		//이해필요
		
		String path = "C:\\Users\\user\\Desktop\\새 폴더\\확장자별 카운트";
		
		File dir = new File(path);
		
		File[]list = dir.listFiles();
		
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for(File f : list) {
			String ext = getExtension(f.getName());
			
			if(!count.containsKey(ext)) {
				count.put(ext, 1); //새로운 확장자 등록
			} else {
				count.put(ext, count.get(ext) + 1); //count = count + 1 누적
			}
				
		}
		
		System.out.println(count);
		
	}

	private static String getExtension(String name) {
		
		// test.png
		// test.test.png
		// System.out.println(name); //마우스01.jpg
		String[] temp = name.split("\\.");
		// System.out.println(temp.length);
		String ext = temp[temp.length - 1].toLowerCase();

		// System.out.println(Arrays.toString(temp));
		// System.out.println(ext);

		return name.split("\\.")[temp.length - 1].toLowerCase();
	}

}
