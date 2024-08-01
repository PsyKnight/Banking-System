package System;

import java.util.Scanner;

public class User {

	private Scanner scanner;

	public void register() {
		scanner.nextLine();
		System.out.println("Full Name: ");
		String full_name = scanner.nextLine();
		System.out.println("Email: ");
		String email = scanner.nextLine();
		System.out.println("Password: ");
		String password = scanner.nextLine();

		if (user_exist(email)) {
			System.err.println("User already exists");
			return;
		}
	}

	public String login() {
		scanner.nextLine();
		System.err.println("Email: ");
		String email = scanner.nextLine();
		System.out.println("Password: ");
		String password = scanner.nextLine();
		return null;
	}

	public boolean user_exist(String email) {

		return false;
	}
}
