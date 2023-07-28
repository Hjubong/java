package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		/*
			요구사항
			숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
			
			조건..
			int[] nums = new int[5];
			
			입력..
			숫자: 5 
			숫자: 1 
			숫자: 7 
			숫자: 2 
			숫자: 3 
			
			출력..
			nums[4] = 3
			nums[3] = 2
			nums[2] = 7
			nums[1] = 1
			nums[0] = 5 
		 */
		int input = 0;
		
		int[] nums = new int[5];
		
		Scanner scan = new Scanner(System.in);
		//length 사용
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			input = scan.nextInt();
			nums[i] =input;
		}

		for(int i=4; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
			System.out.println();
		}
		
		
	}
}
