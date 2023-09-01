package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Q120 {

	public static void main(String[] args) {
		
		/*
			특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
			
			조건..
			'유재석' → '메뚜기'
			저장할 파일명: 이름수정_변환.dat
			
			출력..
			변환 후 다른 이름으로 저장하였습니다. 
		 */
		
		try {
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\입출력\\이름수정.dat"));
			
			ArrayList<String>modify = new ArrayList<>();
			
			String line = null;
			
			while((line = reader.readLine()) !=null) {
				
				String modify1 = line.replace("유재석", "메뚜기");
				
				modify.add(modify1);
				
			}
			
			reader.close();	
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\입출력\\이름수정_변환.dat"));
			
			for(String modify1 : modify) {
				writer.write(modify1);
				writer.newLine();
			}
			
			writer.close();
			
			System.out.println("변환 후 다른이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
