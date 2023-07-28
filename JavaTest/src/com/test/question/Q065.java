package com.test.question;

import java.util.Random;
import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {

		/*
		 * 요구사항 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		 * 
		 * 조건.. 난수를 20개 발생 후 배열에 넣는다. 난수는 1 ~ 20 사이 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		 * 
		 * 입력.. 최대 범위: 15 최소 범위: 5
		 * 
		 * 출력.. 원본: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
		 * 결과: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] list = new int[20];
		int min = 0; 
		int max = 0;
		Random random = new Random();
		
		for (int i = 0; i < list.length; i++) {

			list[i] = random.nextInt(20) + 1;
		}

		for (int i = 0; i < list.length; i++) {

			if (list[i] < min) {
				min = list[i];
			}

			if (list[i] > max) {
				max = list[i];
			}
		}

		System.out.print("최대범위: ");
		max = scan.nextInt();

		System.out.print("최소범위: ");
		min = scan.nextInt();

		System.out.print("원본: ");

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}

		System.out.println();
		System.out.print("결과: ");
		
		for(int i=0; i< list.length; i++) {
			if(list[i]>=min && list[i]<=max) {
				System.out.print(list[i] +", ");
			}
		}
	}// main
}
