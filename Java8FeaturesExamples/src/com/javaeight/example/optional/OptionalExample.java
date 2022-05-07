package com.javaeight.example.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String args[]) {
		User user = new User();
		//System.out.println(user.getUserName());
		Optional<String> userName = user.getUserName();
		if (userName.isPresent() && userName.get().equalsIgnoreCase("TalentSprint")) {
			System.out.println("user name is Talent sprint");
		} else
			System.out.println("User name is not present");
	}

}
