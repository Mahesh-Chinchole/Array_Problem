package com.array;

import java.util.Scanner;

public class Addition_2D_Array {

	public static void main(String[] args) {
		
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Matrix:");
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<2;j++)
    	   {
    		   a[i][j]=s.nextInt();
    	   }
       }
       System.out.println("Enter Second Matrix:");
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<2;j++)
    	   {
    		   b[i][j]=s.nextInt();
    	   }
       }
       System.out.println(" first Matrix:");
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<2;j++)
    	   {
    		   System.out.print(a[i][j]+" ");   	   }
       }
       System.out.println(" Second Matrix:");
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<2;j++)
    	   {
    		   System.out.print(b[i][j]+" ");   	   }
       }
       System.out.println(" Sum of Matrix:");
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<2;j++)
    	   {
    		   c[i][j]=a[i][j]+b[i][j];
    		   System.out.print(c[i][j]+" ");   	   }
       }
       System.out.println();
	}

}
