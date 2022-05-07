package com.javaeight.example.definterfaces;

public class TestDefaultInterfaceExample implements InterfaceWithDefault {
	public static void main(String args[]) {
		TestDefaultInterfaceExample testDefaultInterfaceExample = new TestDefaultInterfaceExample();
		testDefaultInterfaceExample.example();
	}
	
	@Override
	  public void example() { 
		  System.out.println("Hello"); 
	  }
	 

}
