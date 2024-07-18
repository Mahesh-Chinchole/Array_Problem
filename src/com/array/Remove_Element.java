package com.array;

import java.util.Arrays;

public class Remove_Element {
   public static void main(String[] args) {
	
	   int []array= {10,20,30,40,50,60};
	   
	   System.out.println("Original Array: "+Arrays.toString(array));
	   
	   int remove=1;
	   
	   for(int i=remove;i<array.length-1;i++)
	   {
		   array[i]=array[i+1];
	   }
	   System.out.println("After removing Array: "+Arrays.toString(array));
}
}
