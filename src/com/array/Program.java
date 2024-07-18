package com.array;

public class Program {

	public static void main(String[] args) {
		
	//	int [] a= {1,3,4,5,6};//array declartion
		//int [] arr=new int[20];//array declation
		
		int []arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=13;
		arr[4]=10;
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
