package System;

import java.util.Scanner;

public class AccountManager {
	private Scanner scanner;

	public void credit_money(Long account_number) {
		scanner.nextLine();
		System.out.println("Enter Amount: ");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Security Number: ");
		String security_number = scanner.nextLine();
	}
}
