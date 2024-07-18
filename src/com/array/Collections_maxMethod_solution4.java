package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_maxMethod_solution4 {

	public static void main(String[] args) {
		
		int []a= {200,300,4567,564,789,123,980};
		
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		
		System.out.println("Largest Element in array"+Collections.max(list));
		

	}

}
