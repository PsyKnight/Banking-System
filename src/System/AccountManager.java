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

	public void debit_money(long account_number) {
		scanner.nextLine();
		System.out.println("Enter amount: ");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Security Pin: ");
		String security_pin = scanner.nextLine();
	}

	public void transfer_money(long sender_amount_number) {
		scanner.nextLine();
		System.out.println("Enter Reciever Account Number: ");
		long reciver_account_number = scanner.nextLong();
		System.out.println("Enter amount: ");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.err.println("Enter Security Pin: ");
		String security_pin = scanner.nextLine();
	}

	public void getBalance(long account_number) {
		scanner.nextLine();
		System.err.println("Enter Security Pin: ");
		String security_pin = scanner.nextLine();
	}
}
