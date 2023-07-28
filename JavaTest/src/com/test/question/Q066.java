package com.test.question;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q066 {

	public static void main(String[] args) {
		
		/*
			요구사항
			중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
			
			조건..
			숫자의 범위: 1 ~ 45
			오름차순 정렬
			
			출력..
			[1, 5, 23, 36, 37, 41] 
		 */
		
		Random random= new Random();
		int list[] = new int[6];
		String temp = "";
		
		for(int i=0; i<list.length; i++) {
			
			list[i] = random.nextInt(45) + 1;
			
			for(int j=0; j<i; j++) { //중복 검사를 위한 반복문
				if(list[j] == list[i]) { //j는 이전에 생성된 숫자, i는 현재 생성숫자
					i--; //중복이 발생 i를 1 감소.이렇게 하면 중복 검사를 다시 수행.새로운 숫자를 생성.
					break;
				}
			}
		}
		
		Arrays.sort(list);
		
		temp = "[ ";
		
		for(int i=0; i<list.length; i++) {
			temp += list[i] + " ,";
		}
			
		temp += "]";
		
		System.out.println(temp);
	}
}
