/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;
import java.util.Calendar;
import java.util.Scanner;
/*
Your computer knows what the current year is, which means you can incorporate that into your programs.
You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire.
It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output

What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints

Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.

Challenge

Handle situations where the program returns a negative number by stating that the user can already retire.
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int age = myApp.getAge();
        int retire = myApp.getRetire();
        myApp.untilRetire(age, retire);
    }
    int getAge()
    {
        System.out.print("What is your current age? ");
        String input = in.nextLine();
        return Integer.parseInt(input);
    }
    int getRetire()
    {
        System.out.print("At what age would you like to retire? ");
        String input = in.nextLine();
        return Integer.parseInt(input);
    }
    void untilRetire(int age, int retire)
    {
        int difference = retire - age;
        System.out.println("You have " + difference + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = year + difference;
        System.out.print("It's " + year + ", so you can retire in " + retireYear + ".");
    }
}
