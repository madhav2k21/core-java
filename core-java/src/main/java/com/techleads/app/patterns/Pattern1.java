package com.techleads.app.patterns;

public class Pattern1 {
	/*
	***
	***
	***
*/

	public static void main(String[] args) {

		int n = 3;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
