package com.test.question;

import java.util.Random;

public class Q064 {

	public static void main(String[] args) {
		
		/*
			요구사항
			1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
			
			조건..
			난수를 20개 발생 후 배열에 넣는다.
			난수는 1 ~ 20 사이
			
			출력..
			원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
			최댓값: 18
			최솟값: 3 
		 */
		
		
		int[]list = new int[20];
		int min = 21; //min 과 max 초기값 설정 포인트
		int max = 0;
		Random random = new Random();
		
		for(int i=0; i<list.length; i++) {
			
			list[i] = random.nextInt(20) +1;
		}
		for(int i=0; i<list.length; i++) {
			// max = (max < nums[i]) ? nums[i] : max;
	        // min = (min > nums[i]) ? nums[i] : min; 
			//이런식으로 for문 작성하지 않아도됨
			
			if(list[i] < min) {
				min = list[i];
			}
			
			if(list[i] > max) {
				max= list[i];
			}
		}
		
		System.out.print("원본: ");
		
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + ", ");
		}
		
		System.out.println();
		
		System.out.printf("최댓값: %d\n", max);
		System.out.printf("최솟값: %d\n", min);
	}
}
