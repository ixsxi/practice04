package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray =new int[5];
		
		intArray[0] = 3;
		intArray[1] = 1;
		intArray[2] = 12;
	
		
		
		int result = 0;
		
		for(int i =0; i <=intArray.length; i++) {       // 일단은 답은 < 이건데 <= 이렇게 하고싶음 어케하나 ?
			result =result + intArray[i];             
		
		}
		System.out.println(result);
	}

}
