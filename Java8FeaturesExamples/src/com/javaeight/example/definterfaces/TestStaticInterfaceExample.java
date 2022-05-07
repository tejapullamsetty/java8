package com.javaeight.example.definterfaces;

public class TestStaticInterfaceExample implements InterfaceWithStatic {
	public static void main(String args[]) {
		// TestStaticInterfaceExample.methodname();
		InterfaceWithStatic.exampleStatic();
		
		TestStaticInterfaceExample testStaticInterfaceExample=new TestStaticInterfaceExample();
		testStaticInterfaceExample.hello();

		String str = "Raviteja";
		String str1 = null;
		if (str != null && str1 != null) {
			System.out.println("Output is" + str);
		} else {
			System.out.println("You may get null pointer exception please do null check before print");
		}

	}
	public void hello() {
		System.out.println("Example");
	}

}
