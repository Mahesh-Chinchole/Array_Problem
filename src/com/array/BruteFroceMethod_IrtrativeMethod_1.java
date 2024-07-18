
//There are certain methods to find the Largest Element in an 
//Array as mentioned below:
//
//1.Iterative Way
//2.Java 8 Stream
//3.Sorting
//4.Using Collections.max()

package com.array;

public class BruteFroceMethod_IrtrativeMethod_1 {
	
	static int [] arr= {10,20,30,400,5000};
	
	static int largest() {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		String max;
		System.out.println("Largest Element in array"+largest());
		
		
	}

}
