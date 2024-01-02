package hexlet.code.games;

import hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;

public class Calculator implements Games {
    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;


    public Calculator(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        final char[] arithmeticSigns = {'-', '+', '*'};
        Random random = new Random();
        int firstNumber = random.nextInt(0, 100);
        int secondNumber = random.nextInt(0, 100);
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
