
//Write a Java program to sort a numeric array and a string array.

package com.array;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		
		int []a= {1234,453,5678,98567,9870 };
		
		System.out.println("Original Array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorting Array:"+Arrays.toString(a));
	}

}
