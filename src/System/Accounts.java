package System;

import java.sql.Connection;
import java.util.Scanner;

public class Accounts {
	private Scanner scanner;
	public Accounts(Connection connection, Scanner scanner) {
		
	}

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
		return 0;
	}

	public long getAccount_number(String email) {

		return 0;
	}

	public void generate_account_number() {

	}

	private boolean account_exists() {

		return false;
	}
}
