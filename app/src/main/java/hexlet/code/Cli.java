package hexlet.code;


import hexlet.code.games.Calculator;
import hexlet.code.games.EvenNumber;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public final class Cli {
    void greeting() {
        final int answer0 = 0;
        final int answer1 = 1;
        final int answer2 = 2;
        final int answer3 = 3;
        final int answer4 = 4;
        final int answer5 = 5;
        final int answer6 = 6;

        Scanner scanner = new Scanner(System.in);
        Greeting greeting = new Greeting(scanner);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == answer1) {
            greeting.greeting();
        } else if (choice == answer2) {
            EvenNumber evenNumber = new EvenNumber(greeting.greeting(), scanner);
            evenNumber.play();
        } else if (choice == answer3) {
            Calculator calculator = new Calculator(greeting.greeting(), scanner);
            calculator.play();
        } else if (choice == answer4) {
            GCD gcd = new GCD(greeting.greeting(), scanner);
            gcd.play();
        } else if (choice == answer5) {
            Progression progression = new Progression(greeting.greeting(), scanner);
            progression.play();
        } else if (choice == answer6) {
            Prime prime = new Prime(greeting.greeting(), scanner);
            prime.play();
        } else if (choice == answer0) {
            return;
        }
    }
}
