
//Write a Java program to sum values of an array.


package com.array;

public class Sum_Of_Arrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int sum=0;
		
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Array:"+sum);
	}

}
