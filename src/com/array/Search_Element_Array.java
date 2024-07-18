package com.array;

import java.util.Scanner;

public class Search_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []a=new int[5];
       int n;
       int count=0;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the element:");
       
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=s.nextInt();
       }
       System.out.println("Array Element:");
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]+" ");
       }
       
       System.out.println("Search Array element:");
       n=s.nextInt();
       
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]==n)
    	   {
    		   count++;
    	   }
       }
       if(count>0)
       {
    	   System.out.println("Item fonud "+count+ "times");
       }
       else {
    	   System.out.println("Item not Found");
       }
       
       
	}

}
