package hexlet.code;

public interface Games {
    String getInstruction();
    String getAnswer();
    String getCorrectAnswer();
    String getName();

    boolean round();
}
