package hexlet.code;

import java.util.Scanner;

public final class Greeting {
    private String name;
    private Scanner scanner;

    public Greeting(Scanner localScanner) {
        this.scanner = localScanner;
    }

    public String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public String getName() {
        return name;
    }
}
