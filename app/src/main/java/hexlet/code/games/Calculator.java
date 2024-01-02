package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;

public final class Calculator implements Games {
    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;


    public Calculator(String localName, Scanner localScanner) {
        this.name = localName;
        this.scanner = localScanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        final char[] arithmeticSigns = {'-', '+', '*'};
        Random random = new Random();
        int maxValue = 100;
        int firstNumber = random.nextInt(maxValue);
        int secondNumber = random.nextInt(maxValue);
        int signIndex = random.nextInt(arithmeticSigns.length);
        System.out.println("Question: " + firstNumber + " " + arithmeticSigns[signIndex] + " " + secondNumber);
        System.out.println("Your answer: ");
        answer = scanner.next();
        if (arithmeticSigns[signIndex] == '-') {
            correctAnswer = String.valueOf(firstNumber - secondNumber);
        } else if (arithmeticSigns[signIndex] == '+') {
            correctAnswer = String.valueOf(firstNumber + secondNumber);
        } else if (arithmeticSigns[signIndex] == '*') {
            correctAnswer = String.valueOf(firstNumber * secondNumber);
        }
        return answer.equals(correctAnswer);

    }


    public String getInstruction() {
        String instruction = "What is the result of the expression?";
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
