package com.techleads.app.patterns;

public class Pattern4 {
	/***
	1
	12
	123
	1234
***/

	public static void main(String[] args) {

		int n = 4;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
