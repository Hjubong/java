package com.test.question;

import java.util.Arrays;

public class Q070 {

	public static void main(String[] args) {
		
		/*
			출력..
			1	2	3	4	5
			10	9	8	7	6
			11	12	13	14	15
			20	19	18	17	16
			21	22	23	24	25

		 */
		
		int[][]list = new int[5][5];
		int n =1;
		
		for(int i=0; i<list.length; i++) {
			
			if(i % 2 ==0) {
				for(int j=0; j<list[0].length; j++) {
					list[i][j] = n;
					n++;
				}
			} else {
				for(int j=list[0].length-1; j>=0; j-- ) {
					list[i][j] = n;
					n++;
				}
			}
		}
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[0].length; j++) {
				System.out.printf("%2d\t", list[i][j]);
			}
			System.out.println();
		}
	}
}
