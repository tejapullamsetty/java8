package com.javaeight.example;

import java.util.TreeMap;

public class SortTreeMapWithLambdaExpression {
	public static void main(String args[]) {
		TreeMap<Integer, String>tm=new TreeMap<Integer, String>((t1, t2) -> (t1 > t2) ? -1 : (t1 < t2) ? +1 : 0);
		tm.put(10, "Ravi");
		tm.put(50, "Teja");
		tm.put(20, "Hari");
		tm.put(60, "Jonny");
		tm.put(30, "Pavan");
		System.out.println(tm);
	}

}
