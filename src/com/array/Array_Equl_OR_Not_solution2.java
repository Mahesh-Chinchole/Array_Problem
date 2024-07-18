package com.array;

public class Array_Equl_OR_Not_solution2 {
  public static void main(String[] args) {
	 int a[]= {1,2,3,4,5};
	 int b[]= {1,2,3,4,8};
	 
	 boolean Result = true;
	if(a.length==b.length)
	 { 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]!=b[i])
			 {
				 Result=false;
			 }
		 }
	 }
	 else {
		 Result=false;
	 }
	if(Result==true)
	{
		System.out.println("Array is Equl");
	}
	else {
		System.out.println("Array is not equl");
	}
	 
}
}
