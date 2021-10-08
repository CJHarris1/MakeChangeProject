package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		menu(scanner);

		scanner.close();
	}

	// create user menu
	public static void menu(Scanner scanner) {
		System.out.println("Welcome to the Java store!");
		System.out.println("Are you here to make a purchase? y/n");
		customerYesNo(scanner);
		scanner.nextLine();

	}

	public static void transaction(Scanner scanner) {

		final int twentyDollar = 2000;
		final int tenDollar = 1000;
		final int fiveDollar = 500;
		final int oneDollar = 100;
		final int quarter = 25;
		final int dime = 10;
		final int nickel = 5;
		final int penny = 1;

		// The user is prompted asking for the price of the item.
		System.out.println("Please enter the price of the item: ");
		double itemPrice = scanner.nextDouble();
		scanner.nextLine();

		// The user is then prompted asking how much money was tendered by the customer.
		System.out.println("Please enter amount tendered by customer: ");
		double amountTendered = scanner.nextDouble();
		scanner.nextLine();

		// how much, if any is owed
		boolean owesMore = true;
		while (owesMore) {
			// customer did not give enough money for item
			while (itemPrice > amountTendered) {
				double amountLeft = 0;
				amountLeft = itemPrice - amountTendered;
				System.out.println("Im sorry, you are still missing $" + amountLeft);
				System.out.println("Would you like to continue the transaction? y/n");
				customerYesNo(scanner);
				scanner.nextLine();

			}
			// correct amount was given
			if (itemPrice == amountTendered) {
				System.out.println("Thank you for your purchase, have a nice day!");
				owesMore = false;
				System.out.println("Would you like to make another purchase? y/n");
				customerYesNo(scanner);
				scanner.nextLine();

				// break;
			}
			// customer needs change
			else {
				double remainingChangeDue = 0.0;
				boolean changeGivenInFull = false;
				while (!changeGivenInFull) {
					remainingChangeDue = amountTendered - itemPrice;
					System.out.println(remainingChangeDue);

				}
			}
		}

	}

	// Any time customer is asked a yes or no input
	public static void customerYesNo(Scanner scanner) {
		String userChoice = scanner.nextLine();

		switch (userChoice) {
		case "y":
		case "Y":
		case "yes":
		case "Yes":
		case "YES":
			transaction(scanner);
			scanner.nextLine();

		case "n":
		case "N":
		case "NO":
		case "No":
			System.out.println("Have a nice day!");
			break;
		}

	}

//		public static void correctChange() {
//			
//			final int twentyDollar = 2000;
//			final int tenDollar = 1000;
//			final int fiveDollar = 500;
//			final int oneDollar = 100;
//			final int quarter = 25;
//			final int dime = 10;
//			final int nickel = 5;
//			final int penny = 1;
//			
//			
//			
//		}

}
