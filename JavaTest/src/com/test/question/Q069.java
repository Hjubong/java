package com.test.question;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q069 {

	public static void main(String[] args) {

		/*
		 * 요구사항 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
		 * 
		 * 조건.. 원본 배열 길이: 사용자 입력 원본 배열 요소: 난수(1~9) 결과 배열 길이: 사용자 입력 / 2
		 * 
		 * 입력.. 배열 길이: 10
		 * 
		 * 출력.. 원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ] 결과: [ 6, 9, 9, 10, 11 ]
		 */
		int input = 0;

		Random random = new Random();

		Scanner scan = new Scanner(System.in);

		System.out.print("배열 길이: ");
		input = scan.nextInt();

		int[] nums = new int[input];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(9) + 1;
		}

		int[] sum = new int[nums.length / 2];
		for (int i = 0; i < nums.length - 1; i += 2) {
			sum[i / 2] = nums[i] + nums[i + 1];
		}
		
		System.out.print("원본: " + Arrays.toString(nums));
		System.out.println();
		System.out.print("결과: " + Arrays.toString(sum));
		
	}
}
