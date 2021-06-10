package com.techleads.app.arrays;

public class MinAndMax {
	public static void main(String[] args) {
		int[] ar= {14, -10, 1, 2, -4, 5, -9, 7, 3};
		
		int min=ar[0];
		int max=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
			if(max < ar[i]) {
				max=ar[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
