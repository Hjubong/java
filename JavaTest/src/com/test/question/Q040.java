package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {
		/*
		 * 요구사항 아래와 같이 출력하시오.
		 * 
		 * 입력.. 시작 숫자: 1 종료 숫자: 10
		 * 
		 * 출력.. 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("시작 숫자:");
		int start = scan.nextInt();

		System.out.println("종료 숫자: ");
		int end = scan.nextInt();

		int sum = 0;
		String txt = "";
		String op = " - ";

		// 답지 참고함 이해 필요
		for (int i = start; i <= end; i++) {
			/*
			 * minus변수가 - 라면 현재 i값을 sum에 더하고 txt 문자열에 i를 추가합니다 minus 변수를 +로 변경합니다
			 */
			if (op.equals(" - ")) {
				sum += i;
				txt += i;
				op = " + ";
				// 만약 현재 i가 end보다 작으면 txt 문자열에 +를 추가합니다
				if (i < end) {
					txt += op;
				}
				// 그렇지 않으면 (즉, op 변수가 " + "인 경우), 현재 "i" 값을 sum에서 뺀 후 "txt" 문자열에 "i"를 추가합니다.
				// op 변수를 " - "로 변경합니다.

			} else {
				sum -= i;
				txt += i;
				op = " - ";
				// 만약 현재 "i"가 end보다 작으면, "txt" 문자열에 " - "를 추가합니다.
				if (i < end) {
					txt += op;
				}
			}
		}

		System.out.println(txt + " = " + sum);

	}
}
