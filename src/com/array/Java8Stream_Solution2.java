package com.array;

import java.util.Arrays;

public class Java8Stream_Solution2 {

	public static void main(String[] args) {
		
		int[]a= {10,30,450,2490,345};
		
		 int max = Arrays.stream(a).max().getAsInt(); 
	       
         // Printing the result
       System.out.println("Largest in given array is " +max); 
   

	}

}
