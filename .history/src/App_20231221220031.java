import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        NumberProcessor processor = new NumberProcessor(getUserInput());

        processor.processNumbers();
    }
    private static UserInput getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number of your range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the last number of your range: ");
        int endRange = scanner.nextInt();

        scanner.close();

        return new UserInput(startRange, endRange);
    }
}
