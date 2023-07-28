package com.test.question;

import java.util.Scanner;

public class Q047 {

	public static void main(String[] args) {
		/*
		 * 요구사항 자판기 프로그램을 구현하시오..
		 */
		int input = 0;
		int num = 0;

		boolean loop = true;

		while (loop) {

			menu();

			Scanner scan = new Scanner(System.in);
			System.out.print("금액 투입(원): ");
			input = scan.nextInt();

			System.out.println("----------------");
			System.out.print("음료 선택(번호): ");

			while (true) {
				num = scan.nextInt();
				if (num >= 1 && num <= 3) {
					break; // 올바른 입력이면 루프를 종료
				} else {
					System.out.println("1부터 3까지의 값을 입력해주세요.");
					System.out.print("음료 선택(번호): ");
				}
			}

			if (num == 1 && input < 700) {
				System.out.println("금액이 부족합니다.");
				continue;
			} else if (num == 2 && input < 600) {
				System.out.println("금액이 부족합니다.");
				continue;
			} else if (num == 3 && input < 500) {
				System.out.println("금액이 부족합니다.");
				continue; 
			} 

			if (num == 1) {
				System.out.print("+콜라를 제공합니다.\n");
				System.out.printf("+잔돈 %d원을 제공합니다.\n", input - 700);
			}

			else if (num == 2) {
				System.out.print("+사이다를 제공합니다.\n");
				System.out.printf("+잔돈 %d원을 제공합니다.\n", input - 600);
			}

			else if (num == 3) {
				System.out.print("+비타500를 제공합니다.\n");
				System.out.printf("+잔돈 %d원을 제공합니다.\n", input - 500);
			}
			
			scan.nextLine();
			System.out.println("계속하려면 엔터를 입력하세요");
			scan.nextLine();
		}

	}

	private static void menu() {
		System.out.println("===============");
		System.out.println("    자판기");
		System.out.println("===============");
		System.out.print("1. 콜라: 700원\n");
		System.out.print("2. 사이다: 600원\n");
		System.out.print("3. 비타500: 500원\n");
		System.out.println("----------------");
	}
}
