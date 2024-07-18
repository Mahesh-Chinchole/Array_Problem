package com.array;

public class Matrix_SimpleTravasal_2DArray {
	
	public static void print2D(int mat[][])
	{
		
		for(int i=0;i<mat.length;i++)
		{
			 for(int j=0;j<mat[i].length;j++)
			 {
				 System.out.print(mat[i][j]+" ");
			 }
			 System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int mat[][]= {{10,20,30},{40,50,60},{70,80,90}};
		print2D(mat);
		
	}

}
