package com.javaeight.example.optional;

import java.util.Optional;

public class OptionalExampleUsingMethods {
	
	public static void main(String args[]) {
		
		//it returns empty optional
		Optional emptyOptional=Optional.empty();
		
		//it returns non empty optional i.e., if value is there it prints else Null pointer exception
		Optional nonEmptyOptional=Optional.of("TalentSprint");
		
		Optional nonEmptyorEmptyOptional=Optional.ofNullable("TalentSprint");
		Optional nonEmptyorEmptyOptional1=Optional.ofNullable(null);
		
		System.out.println(emptyOptional);
		System.out.println(nonEmptyOptional);
		System.out.println(nonEmptyorEmptyOptional);
		System.out.println(nonEmptyorEmptyOptional1);
	}

}
