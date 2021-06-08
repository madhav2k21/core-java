package com.techleads.app.patterns;

public class Pattern3 {
	/***
	1
	22
	333
	4444
***/
	public static void main(String[] args) {

		int n = 4;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
