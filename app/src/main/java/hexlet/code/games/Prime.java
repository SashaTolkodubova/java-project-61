package hexlet.code.games;

import hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;

public class Prime implements Games {
    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;

    public Prime(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        Random random = new Random();
        int number = random.nextInt(100);
        if (isPrime(number)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        System.out.println("Question: " + number);
        System.out.println("Your answer: ");
        answer = scanner.next();
        return correctAnswer.equals(answer);
    }

    private boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public String getInstruction() {
        String instruction = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return instruction;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getName() {
        return name;
    }
}
