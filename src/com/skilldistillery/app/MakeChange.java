package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Java store!");

		while (customerYesNo(scanner) == true) {
			int changeDue;
			changeDue = startTransaction(scanner);
			if (changeDue < 0) {
				underPrice(scanner);
				continue;
			} else if (changeDue == 0) {
				exactAmount(scanner);
				continue;
			} else {
				giveChange(scanner, changeDue);
				continue;
			}

		}

		scanner.close();
	}

	// any time the user is prompted for a yes or no question
	public static boolean customerYesNo(Scanner scanner) {
		boolean makingPurchase = false;
		System.out.println("Would you like to make a purchase? y/n");
		String userChoice = scanner.nextLine();

		switch (userChoice) {
		case "y":
		case "Y":
		case "yes":
		case "Yes":
		case "YES":
			makingPurchase = true;
			break;

		case "n":
		case "N":
		case "NO":
		case "No":
			makingPurchase = false;
			System.out.println("Have a nice day!");
			break;

		default:
			System.out.println("Invalid choice, would you like to make a purchase? y/n");
			customerYesNo(scanner);
			break;
		}
		return makingPurchase;

	}

	public static int startTransaction(Scanner scanner) {
		// The user is prompted asking for the price of the item.
		System.out.println("Please enter the price of the item: ");
		double itemPrice = scanner.nextDouble();
		scanner.nextLine();

		// The user is then prompted asking how much money was tendered by the customer.
		System.out.println("Please enter amount given by customer: ");
		double amountTendered = scanner.nextDouble();
		scanner.nextLine();

		int changeDue = (int) ((amountTendered * 100) - (itemPrice * 100));
		return changeDue;
	}

	public static void underPrice(Scanner scanner) {
		// customer did not give enough money for item
		System.out.println("Im sorry, that is not enough to cover the price of the item.");

	}

	public static void exactAmount(Scanner scanner) {
		// correct amount was given
		System.out.println("Thank you for your purchase!");

	}

	public static void giveChange(Scanner scanner, int changeDue) {

		System.out.print("Your change will be: ");
		// customer needs change
		changeDue = checkTwenty(changeDue);
		changeDue = checkTen(changeDue);
		changeDue = checkFive(changeDue);
		changeDue = checkOne(changeDue);
		changeDue = checkQuarter(changeDue);
		changeDue = checkDime(changeDue);
		changeDue = checkNickel(changeDue);
		changeDue = checkPenny(changeDue);

	}

	public static int checkTwenty(int changeDue) {
		int totalBills = 0;
		final int twentyDollar = 2000;

		if (changeDue % twentyDollar < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / twentyDollar; // how many times bill goes into change
			int remainder = changeDue % twentyDollar; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " twenty dollar bills, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " twenty dollar bills.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " twenty dollar bill, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " twenty dollar bill.");
			}

		}
		return changeDue;
	}

	public static int checkTen(int changeDue) {
		int totalBills = 0;
		final int tenDollar = 1000;

		if (changeDue % tenDollar < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / tenDollar; // how many times bill goes into change
			int remainder = changeDue % tenDollar; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " ten dollar bills, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " ten dollar bills.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " ten dollar bill, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " ten dollar bill.");
			}

		}
		return changeDue;
	}

	public static int checkFive(int changeDue) {
		int totalBills = 0;
		final int fiveDollar = 500;

		if (changeDue % fiveDollar < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / fiveDollar; // how many times bill goes into change
			int remainder = changeDue % fiveDollar; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " five dollar bills, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " five dollar bills.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " five dollar bill, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " five dollar bill.");
			}

		}
		return changeDue;
	}

	public static int checkOne(int changeDue) {
		int totalBills = 0;
		final int oneDollar = 100;

		if (changeDue % oneDollar < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / oneDollar; // how many times bill goes into change
			int remainder = changeDue % oneDollar; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " one dollar bills, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " one dollar bills.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " one dollar bill, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " one dollar bill.");
			}

		}
		return changeDue;
	}

	public static int checkQuarter(int changeDue) {
		int totalBills = 0;
		final int Quarter = 25;

		if (changeDue % Quarter < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / Quarter; // how many times bill goes into change
			int remainder = changeDue % Quarter; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " Quarters, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " Quarters.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " Quarter, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " Quarter.");
			}

		}
		return changeDue;
	}

	public static int checkDime(int changeDue) {
		int totalBills = 0;
		final int Dime = 10;

		if (changeDue % Dime < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / Dime; // how many times bill goes into change
			int remainder = changeDue % Dime; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " Dimes, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " Dimes.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " Dime, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " Dime.");
			}

		}
		return changeDue;
	}

	public static int checkNickel(int changeDue) {
		int totalBills = 0;
		final int Nickel = 5;

		if (changeDue % Nickel < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / Nickel; // how many times bill goes into change
			int remainder = changeDue % Nickel; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " Nickels, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " Nickels.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " Nickel, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " Nickel.");
			}

		}
		return changeDue;
	}

	public static int checkPenny(int changeDue) {
		int totalBills = 0;
		final int Penny = 1;

		if (changeDue % Penny < changeDue) { // checks to see if bill is needed
			totalBills = changeDue / Penny; // how many times bill goes into change
			int remainder = changeDue % Penny; // takes remaining change
			changeDue = remainder; // sets new change due

			if (totalBills > 1 && remainder > 0) {
				System.out.print(totalBills + " Pennies, ");
			} else if (totalBills > 1 && remainder == 0) {
				System.out.println(totalBills + " Pennies.");
			} else if (totalBills == 1 && remainder > 0) {
				System.out.print(totalBills + " Penny, ");
			} else if (totalBills == 1 && remainder == 0) {
				System.out.println(totalBills + " Penny.");
			}

		}
		return changeDue;
	}

}
