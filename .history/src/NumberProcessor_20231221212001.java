import java.util.stream.IntStream;

public class NumberProcessor {
    // class attributes
    private final UserInput userInput;

    public NumberProcessor(UserInput userInput) {
        this.userInput = userInput;
    }

    // method that processes the numbers
    public void processNumbers() {
        // using the java inbuilt IntStream class for the range
        IntStream.rangeClosed((userInput::getStartRangeNumber), (userInput::getEndRangeNumber))
        .for
    }
}
