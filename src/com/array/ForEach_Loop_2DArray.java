package com.array;

public class ForEach_Loop_2DArray {
	 public static void print2D(int mat[][])
	 {
	for(int []row:mat)
	{
		for(int x:row)
		{
			System.out.print(x +" ");
		}
		System.out.println();
	}
	 }
	public static void main(String[] args) {
		int mat[][]={{10,20,30},{40,50,60},{70,80,90}};
		print2D(mat);
	}

}
