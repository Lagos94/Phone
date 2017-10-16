/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 4 Chapter 4
* Computer Configuration
* Due Date: 10/14/17*/

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
            System.out.println("Enter a letter: ");
            while (uInput.hasNext()) {
            String letter = uInput.nextLine();
            char character = letter.charAt(0);
            character = Character.toLowerCase(character);

            int number = 0;
            if (Character.isLetter(character)) {
                if (character >= 'w')
                    number = 9;
                else if (character >= 't')
                    number = 8;
                else if (character >= 'p')
                    number = 7;
                else if (character >= 'm')
                    number = 6;
                else if (character >= 'j')
                    number = 5;
                else if (character >= 'g')
                    number = 4;
                else if (character >= 'd')
                    number = 3;
                else if (character >= 'a')
                    number = 2;
                System.out.println("The corresponding number is " + number + ".");
                // The numbers 1 and 0 are not included since the phone key pads described
                // by the exercise serve for purposes beyond the scope of this program.
            } else {
                System.out.println(character + " is an invalid input!");
            }
            System.out.println("Enter a letter: ");
        }
    }
}