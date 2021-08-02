# Food Truck Application

### Overview

In this project, I had to create a program that allowed a user to input and rate a list of food trucks.  S/he then had the option to view the rating and highest-rating associated with the trucks entered.

I had to include a FoodTruck class with fields for a unique numeric id, a name and a numeric rating.  A separate class with a main method starts the program and stores up to five FoodTruck objects.  The main method in this class is the only static method. Additionally, the following user stories requirements needed to be met:

User Story #1
The user is prompted to input the name, food type, and rating for up to five food trucks. For each set of input, a FoodTruck object is created, its fields set to the user's input, and it is added to the array. The truck id is not input by the user, but instead assigned automatically in the FoodTruck constructor from a static field that is incremented as each truck is created.

User Story #2
If the user inputs quit for the food truck name, input ends immediately and the program continues.

User Story #3
After input is complete, the user sees a menu from which they can choose to:

List all existing food trucks.
See the average rating of food trucks.
Display the highest-rated food truck.
Quit the program.
User Story #4
After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.

### How to Use

### Technologies Used
* Arrays
* Encapsulation
* Getters and Setters
* Debugging

### Lessons Learned

This project was challenging!  In the last project, I went straight to the task of coding.  For this one, I worked on creating the design first to try and solidify the "what" behind each story before I tried to determine how to best tackle the code.  With object oriented programming being a fresh concept, it was also particularly challenging to determine the syntax of where I need to use dot notation or when I should use FoodTruck, truck, trucks, etc.  

This project has helped to more solidly concrete the concepts learned this past week; however, I need to have more exposure to the materials and concepts to grow my confidence in being able to do the work without assistance or while not able to have someone else for demonstration.  This week has been pivotal...I have really been stretched and am no longer comfortable in being quiet if I don't understand.  I know from the study sessions that I participated in that I'm not alone in having questions or feeling behind/overwhelmed.  I'm going to speak up because if I don't I'm only hurting myself.

A decent amount of my time was spent chasing bugs in menu options 2 and 3. I had started with a switch statement to handle the user selecting whichever choice they wanted inside of a while loop. I checked brackets to make sure they were aligned to where they should be in code.  I rewrote the handling of the options later as a a bunch of if - else if statements and that helped some to be able to isolate the error to my methods for handling average rating and highest rating.  My errors as array index out of bounds errors were not found on compilation and had to do with how I went about trying to return the values back from the indices once they were created.  

Thank you for viewing my project.  I hope that you find it as fun as I found challenging!
