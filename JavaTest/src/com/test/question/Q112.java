package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		
		/*
			조건..
			C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
			BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
			입력..
			파일 이동을 실행합니다.
			
			같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 
			
			출력..
			y. 파일을 덮어썼습니다.
		*/
		
		String path = "C:\\class\\java\\file\\AAA\\test.txt";
		String path2= "C:\\class\\java\\file\\BBB\\test.txt";
		
		File file = new File(path);
		File file2 = new File(path2);
		
		System.out.println("파일 이동을 실행합니다.");
		
		if(file2.exists()) {
			
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
			
			Scanner scan = new Scanner(System.in);
			
			if(scan.nextLine().equals("y")) {
				file2.delete();
				file.renameTo(file2);
				System.out.println("파일 이동을 완료했습니다.");
			} else {
				System.out.println("작업을 취소합니다.");
			}
		} else {
			file.renameTo(file2);
			System.out.println("파일 이동을 완료했습니다.");
		}
	}
}
