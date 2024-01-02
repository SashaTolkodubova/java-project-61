package hexlet.code.games;

import hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;

public class Progression implements Games {
    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;

    public Progression(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int arrayLength = random.nextInt(5, 15);
        int secretNumberPosition = random.nextInt(0, arrayLength);
        int firstNumberInProgression = random.nextInt(0, 10);
        int progressionsStep = random.nextInt(1, 10);
        String[] arrayStrings = new String[arrayLength];
        int[] array = new int[arrayLength];

        array[0] = firstNumberInProgression;
        for (int i = 1; i < arrayLength; i++) {
            array[i] = array[i - 1] + progressionsStep;
        }
        for (int i = 0; i < arrayLength; i++) {
            arrayStrings[i] = String.valueOf(array[i]);
        }
        correctAnswer = arrayStrings[secretNumberPosition];
        arrayStrings[secretNumberPosition] = "..";

        stringBuilder.append("Question:");
        for (int i = 0; i < arrayLength; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(arrayStrings[i]);
        }
        System.out.println(stringBuilder);
        System.out.println("Your answer: ");
        answer = scanner.next();
        return correctAnswer.equals(answer);

    }


    public String getInstruction() {
        String instruction = "What number is missing in the progression?";
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
