package com.javaeight.example.definterfaces;

public interface InterfaceWithDefault {
	default void example() {
		System.out.println("This is Default method");
	}

}
