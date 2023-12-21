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
        IntStream.rangeClosed((userInput.getStartRangeNumbergetStartRangeNumber), (userInput::getEndRangeNumber))
        .forEach(number ->{
            if((number % 3 == 0) && (number % 5 == 0)){
                System.out.println("ray_roy");
            } else if(number % 3 == 0){
                System.out.println("ray");
            } else if(number % 5 == 0){
                System.out.println("roy");
            } else{
                System.out.println(number);
            }
        });
    }
}
