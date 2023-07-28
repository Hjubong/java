package com.test.question;

public class Q058 {

	public static void main(String[] args) {
		
		/*
			요구사항
			아래와 같이 출력하시오.
			
			출력..
			 1 ~  10:  55
			11 ~  20: 155
			21 ~  30: 255
			31 ~  40: 355
			41 ~  50: 455
			51 ~  60: 555
			61 ~  70: 655
			71 ~  80: 755
			81 ~  90: 855
			91 ~ 100: 955 
		 */
		
		//코드리뷰: 1~100 for 반복 -> if문으로 10으로 나누는값만 출력
		
		int sum = 0;
		
		for (int i=10; i<=100; i+=10) {
			
			sum = 0;
			
			for(int j=i-9; j<=i; j++) {
				sum += j;
			}
			System.out.printf("%2d~%3d: %4d\n",(i-1*10)+1, i, sum);	
		}
		
	}
}
