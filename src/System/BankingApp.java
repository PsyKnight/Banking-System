package System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingApp {
private static final String url = "jdbc:mysql://localhost:3306/banking_management_system";
private static final String username = "root";
private static final String password = "2005";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Scanner scanner = new Scanner(System.in);
			User user = new User(connection, scanner);
			Accounts accounts = new Accounts(connection, scanner);
			AccountManager accountManager = new AccountManager(connection, scanner);

			String email;
			long account_number;

			while (true) {
				System.out.println("*** WELCOME TO BANKING SYSTEM ***");
				System.out.println();
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				System.out.println("Enter your choice: ");
				int choice1 = scanner.nextInt();
				switch (choice1) {
				case 1:
					user.register();
					break;
				
				case 2: 
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
