package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) {
		
		/*
			성적을 확인 후 합격자/불합격자 명단을 출력하시오.
			
			조건..
			합격 조건: 3과목 평균 60점 이상
			과락 조건: 1과목 40점 미만
			
			출력..
			[합격자] 
			홍길동 
			하하하 
			아무개 
			
			[불합격자] 
			호호호 
			후후후  
		 */
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\입출력\\성적.dat"));
			
			ArrayList<String> pass = new ArrayList<String>();
			ArrayList<String> fail = new ArrayList<String>();
			
			String line = null;
			
			while((line=reader.readLine()) !=null){
				String [] temp = line.split(",");
					
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				
				if((kor + eng + math) / 3 >= 60 && (kor >= 40 && eng >= 40 && math >=40)) {
					pass.add(temp[0]);
				} else {
					fail.add(temp[0]);
				}
			}
			
			System.out.println("[합격자]");
			
			for(String name : pass) {
				System.out.println(name);
			}
			
			System.out.println("[불합격자]");
			
			for(String name : fail) {
				System.out.println(name);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
