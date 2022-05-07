package com.javaeight.example;

import java.util.ArrayList;
import java.util.Collections;

public class SortListWithLambdaExpression {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(5);
		al.add(10);
		al.add(4);
		al.add(40);
		al.add(45);
		System.out.println("Before Sorting" + al);
		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0);
		System.out.println("After Sorting" + al);
	}
	//Sort TreeMap using lambda expression
	//sort TreeSet using lambda expression

}
