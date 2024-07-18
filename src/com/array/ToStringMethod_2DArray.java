package com.array;

import java.util.Arrays;

public class ToStringMethod_2DArray {
	
	 public static void print2D(int mat[][])
	    {
	        // Loop through all rows
	        for (int[] row : mat)
	 
	            // converting each row as string
	            // and then printing in a separate line
	            System.out.println(Arrays.toString(row));
	    }

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        print2D(mat);
		
	}

}
