package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;

public final class Progression implements Games {
    private final String name;
    private final Scanner scanner;
    private String answer;
    private String correctAnswer;

    public Progression(String localname, Scanner localScanner) {
        this.name = localname;
        this.scanner = localScanner;
    }

    public void play() {
        Engine engine = new Engine();
        engine.play(this);
    }

    public boolean round() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int minValueOfArrayLength = 5;
        int maxValueOfArrayLength = 15;
        int maxSizeOfProgression = 10;
        int arrayLength = random.nextInt(minValueOfArrayLength, maxValueOfArrayLength);
        int secretNumberPosition = random.nextInt(arrayLength);
        int firstNumberInProgression = random.nextInt(maxSizeOfProgression);
        int progressionsStep = random.nextInt(maxSizeOfProgression);
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
