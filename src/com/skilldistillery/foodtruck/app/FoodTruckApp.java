package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();
//		Welcome();
//		public void Welcome() {

		Scanner keyboard = new Scanner(System.in);

		// Welcome Message and Instructions

		System.out.println("Welcome to the Food Truck App!\n");
		System.out.println("You will enter & rate a list of food trucks. ");
		System.out.println("You may view the average rating of trucks provided. ");
		System.out.println("You can also find the highest-rated truck!\n");

		// User Interface
		// Create Food Truck array of trucks.
		FoodTruck[] trucks = new FoodTruck[5];
		FoodTruck truck;
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a food truck's name or quit to stop entering trucks: ");
			String foodTruckName = keyboard.nextLine();
			if (!foodTruckName.equalsIgnoreCase("quit")) {
				// Enter Truck Type and Truck Rating
				System.out.println("Please enter the type of food the truck serves: ");
				String foodTruckType = keyboard.nextLine();
				System.out.println("Please enter a numerical rating 1-5 for rating each truck.");
				System.out.println("The rating scale is as follows: ");
				System.out.println("1: BILE INDUCING ");
				System.out.println("2: TASTES AND SMELLS LIKE DURIAN");
				System.out.println("3: NOT HALF BAD");
				System.out.println("4: NEARING PERFECTION");
				System.out.println("5: NIRVANA STATUS ACHIEVED");
				int foodTruckRating = keyboard.nextInt();
				keyboard.nextLine();
				truck = new FoodTruck(foodTruckName, foodTruckType, foodTruckRating);
				trucks[i] = truck;
			} else if (foodTruckName.equalsIgnoreCase("quit")) {
				break;
			}
		}
//		public void mainMenu() {
		String choice = "stop";
		while (!choice.equalsIgnoreCase("quit")) {
			System.out.println("Which menu option would you like to select? ");

			// Display Menu
			System.out.println("************************************************");
			System.out.println("*                                              *");
			System.out.println("*              -App Main Menu-                 *");
			System.out.println("*                                              *");
			System.out.println("*   Please choose from the following options:  *");
			System.out.println("*                                              *");
			System.out.println("*    1: List all existing food trucks.         *");
			System.out.println("*    2: See the average rating of food trucks. *");
			System.out.println("*    3: Display the highest-rated food truck.  *");
			System.out.println("*    4: Quit the program.                      *");
			System.out.println("************************************************");

			int option = keyboard.nextInt();
			keyboard.nextLine();
//	}
			switch (option) {

			case 1:
				app.PrintTrucks(trucks);
				break;

			case 2:
				System.out.println("The averating rating for your food trucks is: " + app.AverageRating(trucks));
				break;

			case 3:
				System.out.println("The food truck with the highest rating is: " + app.HighestRating(trucks).toString());
				break;

			case 4:
				app.SayGoodbye();
				choice = "quit";
				break;
			}
			if (choice == "quit") {
				break;
			}
		}
	}

	public void PrintTrucks(FoodTruck trucks[]) {
		for (int i = 0; i < 5; i++) {
			if (trucks[i] != null) {
				System.out.println(trucks[i].toString());
			} else if (trucks[i] == null) {
				System.out.println("There are no trucks to display.");
				break;
			}
		}
	}

	public FoodTruck AverageRating(FoodTruck trucks[]) {
		int i = 0;
		int rate = 0;
		while (trucks[i].getRating() > rate) {
			rate = trucks[i].getRating();
			i++;
		}
		return trucks[i];
	}

	public FoodTruck HighestRating(FoodTruck trucks[]) {
		int i = 0;
		int rate = 0;
		while (trucks[i] != null && i < 5) {
			if (trucks[i].getRating() > rate) {
				rate = trucks[i].getRating();
				i++;
			}
		}
		return trucks[i];
	}

	public void SayGoodbye() {
		System.out.println("Thank you for using the Food Truck App!  Goodbye! ");
	}

}
