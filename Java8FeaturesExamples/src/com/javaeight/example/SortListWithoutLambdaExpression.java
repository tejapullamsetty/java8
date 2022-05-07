package com.javaeight.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortListWithoutLambdaExpression implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return (o1>o2)?-1:(o1<o2)?+1:0;//conditional operator
		/*
		 * if(o1>o2) { return -1; }else if(o1<o2) { return +1; }else { return 0; }
		 */
	}
	
	public static void main(String args[]) {
			ArrayList<Integer>al=new ArrayList<Integer>();
			al.add(20);
			al.add(5);
			al.add(10);
			al.add(4);
			al.add(40);
			System.out.println("Before Sorting"+al);
			Collections.sort(al,new SortListWithoutLambdaExpression());
			System.out.println("After Sorting"+al);
	}
	

}
