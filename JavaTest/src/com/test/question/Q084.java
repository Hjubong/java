package com.test.question;

public class Q084 {

	public static void main(String[] args) {
		
		/*
			요구사항
			특정 단어가 문장내에 몇회 있어있는지 수를 세시오.
			
			조건..
			대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
			검색 문자열: String word = "길동";
			
			출력..
			'길동'을 총 2회 발견했습니다. 
		 */
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int count = 0;
		int index = -1;
		
		while ((index = content.indexOf(word, index)) > -1) {
			
			count++;
			index = index + word.length();
		}
		
		System.out.printf("'%s'을 총 %d회 발견했습니다.\n", word, count);
	}
}
