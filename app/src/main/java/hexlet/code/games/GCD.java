package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;

public final class GCD implements Games {

    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;

    public GCD(String localName, Scanner localScanner) {
        this.name = localName;
        this.scanner = localScanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        Random random = new Random();
        int minValue = 1;
        int maxValue = 100;
        int firstNumber = random.nextInt(minValue, maxValue);
        int secondNumber = random.nextInt(minValue, maxValue);
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        System.out.println("Your answer: ");
        answer = scanner.next();
        correctAnswer = String.valueOf(gcd(firstNumber, secondNumber));
        return answer.equals(correctAnswer);
    }

    private int gcd(int number1, int number2) {

        if (number1 != 0 && number2 != 0) {
            if (number1 == number2) {
                return number1;
            } else if (number1 < number2) {
                return gcd(number1, number2 % number1);
            } else {
                return gcd(number2, number1 % number2);
            }
        }
        return number1 != 0 ? number1 : number2;
    }

    public String getInstruction() {
        String instruction = "Find the greatest common divisor of given numbers.";
        return instruction;
    }

    public String getName() {
        return name;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
