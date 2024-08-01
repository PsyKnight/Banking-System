package System;

import java.util.Scanner;

public class Accounts {
	private Scanner scanner;

	public long open_account(String email) {
		scanner.nextLine();

		System.out.println("Enter Full Name: ");
		String full_name = scanner.nextLine();

		System.out.println("Enter Initial Amount: ");
		String balance = scanner.nextLine();

		scanner.nextLine();

		System.out.println("Enter Security Pin: ");
		String security_pin = scanner.nextLine();

		scanner.close();
	}
}
