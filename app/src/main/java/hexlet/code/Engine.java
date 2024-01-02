package hexlet.code;



public final class Engine {
    public void play(Games game) {
        System.out.println(game.getInstruction());
        for (int i = 0; i < 3; i++) {
            if (game.round()) {
                System.out.println("Correct!");
            } else {
                System.out.println(game.getAnswer() + " is wrong answer ;(. Correct answer was "
                        + game.getCorrectAnswer() + ".\n"
                        + "Let's try again, " + game.getName() + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + game.getName() + "!");
    }
}
