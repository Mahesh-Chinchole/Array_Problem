package com.array;

import java.util.Arrays;

public class Array_Equl_OR_Not_Solotion1 {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,6};
		int b[]= {1,2,4,5,6};
		
	boolean	Result=Arrays.equals(a,b);
	
	   if(Result==true)
	   {
		   System.out.println("Arry is equal");
	   }
	   else {
		   System.out.println("Arry is not equl");
	   }
	}

}
