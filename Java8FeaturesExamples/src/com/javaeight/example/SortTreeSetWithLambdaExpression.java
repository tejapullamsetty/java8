package com.javaeight.example;

import java.util.TreeSet;

public class SortTreeSetWithLambdaExpression {
	public static void main(String args[]) {
		TreeSet<Integer>ts=new TreeSet<Integer>((t1, t2) -> (t1 > t2) ? -1 : (t1 < t2) ? +1 : 0);
		ts.add(20);
		ts.add(5);
		ts.add(10);
		ts.add(40);
		ts.add(45);
		System.out.println("Sorting" + ts);
	}

}
