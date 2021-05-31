package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int[] intArray = new int[5];
		
		double val =0;
		
		for(int i=0; i<intArray.length; i++) {
			 intArray[i] =sc.nextInt();
			 
			 val =val+intArray[i];
			
		}
		System.out.println("평균은 "+val/intArray.length+"입니다.");
		
	}

}
