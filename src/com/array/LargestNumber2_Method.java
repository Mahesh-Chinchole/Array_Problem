package com.array;

import java.util.Scanner;

public class LargestNumber2_Method {

	public static void main(String[] args) {
		
		int []a=new int[5];
		int max;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 Element in array");
		
//		a[0]=s.nextInt();
//		a[1]=s.nextInt();
		
//		a[2]=s.nextInt();
//		a[3]=s.nextInt();
//		a[4]=s.nextInt();
		
		for(int i=0;i<=4;i++)
		{
			a[i]=s.nextInt();
		}
		
		max=a[0];
		
		for(int i=1;i<=4;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);

	}

}
