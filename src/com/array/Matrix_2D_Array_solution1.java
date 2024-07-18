//Print a 2 D Array or Matrix in Java
//Youtube logic
//Method 1 (Simple Traversal) 
//Method 2 (Using for-each loop) 
//Method 3 (Prints in matrix style Using Arrays.toString()
//Method 4 (Prints in matrix style Using Arrays.deepToString())		
//		


package com.array;

import java.util.Scanner;

public class Matrix_2D_Array_solution1 {
	
	
	public static void main(String[] args) {
		
		int [][]a=new int[2][2];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 4 Element :");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
