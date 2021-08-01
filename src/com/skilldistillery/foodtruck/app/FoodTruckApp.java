package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();

		Scanner keyboard = new Scanner(System.in);

		// Welcome Message and Instructions
		System.out.println("Welcome to the Food Truck App! ");
		System.out.println();
		System.out.println("You will enter & rate a list of food trucks. ");
		System.out.println("You may view the average rating of trucks provided. ");
		System.out.println("You can also find the highest-rated truck!");
		System.out.println();

		// User Interface
		FoodTruck[] trucks = new FoodTruck[5];
		FoodTruck truck;
		for (int i = 0; i < 5; i++) {
			// Please enter up to 5 FoodTrucks or enter QUIT to stop.
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
			} else if (foodTruckName.equalsIgnoreCase("quit")) {
				break;
			}
		}
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

//		switch (option) {
//		Case "1":
//
//	display[]Trucks(name);
//		System.out.println("Here are all the food trucks provided: " + name);
//		break;
//		Case "2":
////			/getRating()
////		System.out.println("The average food truck rating is: " total ratings/numofTrucks);
//		break;
//		Case "3":
////			/getRating()
//		Case "4":
//			break;

		
	}
}
