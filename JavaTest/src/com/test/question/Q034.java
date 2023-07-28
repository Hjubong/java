package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
			
			조건..
			입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
			입력받은 날짜가 토/일요일이면 아무것도 안한다.
		 */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년: ");
		int year = scan.nextInt();
		
		System.out.print("월: ");
		int month = scan.nextInt();
		
		System.out.print("일: ");
		int day = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		now.set(year, month-1, day); //month 값 구할때 -1 주의 !
		
		if (now.get(Calendar.DAY_OF_WEEK) !=1 
				&& now.get(Calendar.DAY_OF_WEEK) !=7) {
			System.out.print("입력하신 날짜는 '평일'입니다.\r\n"
					+ "해당 주의 토요일로 이동합니다.");
			now.add(Calendar.DATE, 7 - now.get(Calendar.DAY_OF_WEEK)); // 무슨 코드인지 고민해보기
			// 7(토요일)에서 평일값 2,3,4,5,6 을 빼서 더해주면 주말로 돌아감
			System.out.printf("이동한 날짜는 'tF%' 입니다.\n", now);
		} else {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다."
					+ "결과가 없습니다.");
		}
		
	}
}
