package org.example;

import java.util.Scanner;


public class JavaQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int score = 0;

        System.out.println("*******************************************");
        System.out.println("Welcome to Java Quiz!");
        System.out.println("*******************************************");
        System.out.println(" ");


        System.out.println("Question 1. How do you declare a variable?");
        System.out.println(" ");
        System.out.println("1) int number = 10");
        System.out.println("2) number int = 10;");
        System.out.println("3) declare int number = 10;");
        System.out.println("4) int number = 10;");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice1 = scanner.nextLine();

            if (choice1.equals("4")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect");
            }


        System.out.println(" ");
        System.out.println("Question 2. Which of these is NOT a primitive data type?");
        System.out.println(" ");
        System.out.println("1) boolean");
        System.out.println("2) charizard");
        System.out.println("3) integer");
        System.out.println("4) double");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice2 = scanner.nextLine();

        if (choice2.equals("2")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 3. What is the output of the following code?");
        System.out.println(" ");
        System.out.println("double myDouble = 8.97d;");
                System.out.println("int myInt = (int) myDouble;");
                System.out.println("System.out.println(myInt);");
                System.out.println(" ");

        System.out.println("1) 9.0");
        System.out.println("2) 9");
        System.out.println("3) 8.90");
        System.out.println("4) 8");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice3 = scanner.nextLine();

        if (choice3.equals("4")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 4. What will be the value of variable z after this code runs?");
        System.out.println(" ");
        System.out.println("String x = \"5\";");
                System.out.println("String y = \"20\";");
                System.out.println("String z = x + y;");
                System.out.println(" ");

        System.out.println("1) 520");
        System.out.println("2) 25");
        System.out.println("3) 25.0");
        System.out.println("4) Error");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice4 = scanner.nextLine();

        if (choice4.equals("1")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 5. What does the following method return?");
        System.out.println(" ");
        System.out.println("public int addNumbers(int a, int b) {");
        System.out.println("    return a + b;");
        System.out.println("}");
        System.out.println(" ");
        System.out.println("What will addNumbers(3, 7) return?");
        System.out.println(" ");


        System.out.println("1) 10");
        System.out.println("2) 37");
        System.out.println("3) addNumbers");
        System.out.println("4) 73");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice5 = scanner.nextLine();

        if (choice5.equals("1")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 6. What is the purpose of a method in Java?");
        System.out.println(" ");
        System.out.println("1) To store data");
        System.out.println("2) To perform a specific task or calculation");
        System.out.println("3) To define a class");
        System.out.println("4) To create a loop");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice6 = scanner.nextLine();


        if (choice6.equals("2")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 7. What is the difference between .length and .length() in Java?");
        System.out.println(" ");
        System.out.println("1) .length is used for arrays, .length() is used for Strings");
        System.out.println("2) .length() is used for arrays, .length is used for Strings");
        System.out.println("3) Both are methods used to measure the size of any object");
        System.out.println("4) They are the same and can be used interchangeably");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice7 = scanner.nextLine();


        if (choice7.equals("1")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 8. What will the following code print?");
        System.out.println(" ");
        System.out.println("String message = \"hello world\";");
        System.out.println("int index = message.indexOf(\"o\");");
        System.out.println("System.out.println(index);");
        System.out.println(" ");
        System.out.println("1) 4");
        System.out.println("2) 5");
        System.out.println("3) 7");
        System.out.println("4) 10");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice8 = scanner.nextLine();

        if (choice8.equals("2")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 9. Instead of writing many if..else statements, you can use the _________ statement");
        System.out.println(" ");
        System.out.println("1) else if");
        System.out.println("2) loop");
        System.out.println("3) switch");
        System.out.println("4) return");
        System.out.println(" ");

        System.out.println("Enter 1, 2, 3, or 4");
        String choice9 = scanner.nextLine();


        if (choice9.equals("3")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println(" ");
        System.out.println("Question 10. An interface is a completely abstract class that is used to group related methods with empty bodies.");
        System.out.println(" ");
        System.out.println("True");
        System.out.println("False");

        System.out.println(" ");

        System.out.println("Enter True or False");
        String choice10 = scanner.nextLine();


        if (choice10.equalsIgnoreCase("true")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }


        System.out.println("Your final score is " + score + " out of 10");

        if (score >= 7) {
            System.out.println("Congratulations! You passed the test.");
        } else {
            System.out.println("Sorry, you did not pass. Better luck next time.");
        }
        

    }
}


