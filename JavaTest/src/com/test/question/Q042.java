package com.test.question;

public class Q042 {

	public static void main(String[] args) {
		/*
			요구사항
			서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
			
			조건..
			Calendar 클래스 사용 금지
			
			출력..
			2023년 7월 24일은 738,725일째 되는 날이고 월요일입니다.
		 */
		
		//챗선생님 도움 받음 일단 패스
		        int todayYear = 2023; 
		        int todayMonth = 7;   
		        int todayDay = 24;    

		        int totalDays = 0;

		        // 각 월의 일수를 배열로 저장합니다.
		        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		        
		        // 서기 1년 1월 1일부터 오늘까지의 일수를 계산합니다.
		        for (int year = 1; year < todayYear; year++) {
		            totalDays += isLeapYear(year) ? 366 : 365;
		        }

		        for (int month = 1; month < todayMonth; month++) {
		            totalDays += daysInMonth[month - 1];
		            if (month == 2 && isLeapYear(todayYear)) {
		                totalDays++; // 윤년이면 2월이 1일 늘어납니다.
		            }
		        }

		        totalDays += todayDay;

		        System.out.println("서기 1년 1월 1일부터 오늘까지 며칠째인지 합: " + totalDays);
		    }

		    // 윤년을 판단하는 메서드
		    public static boolean isLeapYear(int year) {
		        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		    
	}
}
