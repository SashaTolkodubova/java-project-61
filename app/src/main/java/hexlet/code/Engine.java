package hexlet.code;



public final class Engine {
    public void play(Games game) {
        System.out.println(game.getInstruction());
        int rounds = 3;
        while (rounds > 0) {
            if (game.round()) {
                System.out.println("Correct!");
                rounds--;
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
