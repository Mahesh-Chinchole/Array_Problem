package com.array;

import java.util.Arrays;

public class DeepToStringMethod_2DArray {

	
	 public static void print2D(int mat[][])
	    {
	        System.out.println(Arrays.deepToString(mat));
	    }
	public static void main(String[] args) {
		 int mat[][] = { { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 },
                 { 9, 10, 11, 12 } };
 print2D(mat);
	}

}
