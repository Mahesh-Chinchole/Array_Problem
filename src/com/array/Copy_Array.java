package com.array;

import java.util.Scanner;

public class Copy_Array {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		int b[]=new int[5];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element in array");
		
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("First element in array");
		for(int i=0;i<5;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nsecond element in array");
		 
		 for(int i=0;i<5;i++)
		 {
			 b[i]=a[i];
			 System.out.print(b[i]+" ");
		 }
		
		
		
	}

}
