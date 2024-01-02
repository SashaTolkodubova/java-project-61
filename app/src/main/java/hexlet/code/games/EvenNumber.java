package hexlet.code.games;


import hexlet.code.Games;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class EvenNumber implements Games {
    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;


    public EvenNumber(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        Random random = new Random();
        int number = random.nextInt(0, 100);
        System.out.println("Question: " + number);
        System.out.println("Your answer: ");
        answer = scanner.next();
        correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return checkAnswer(number, answer);
    }

    private boolean checkAnswer(int number, String localAnswer) {
        return (number % 2 == 0) && (Objects.equals(localAnswer, "yes")) || ((number % 2 != 0)
                && (Objects.equals(localAnswer, "no")));
    }

    public String getInstruction() {
        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
