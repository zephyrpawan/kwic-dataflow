import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        CircularShifter circularShifter = new CircularShifter();
        Alphabetizer alphabetizer = new Alphabetizer();

        String inputText = "The Key Word in Context index system accepts an ordered set of lines. Each line is an ordered set of words, and each word is an ordered set of characters. Any line may be circularly shifted by repeatedly removing the first word and appending it at the end of the line. The KWIC index system outputs a listing of all circular shifts of all lines in alphabetical order.";

        // Input
        List<String> input = inputParser.parseInput(inputText);

        // Shift
        List<String> shiftedInput = circularShifter.execute(input);

        // Alphabetize
        List<String> alphabetized = alphabetizer.execute(shiftedInput);

        // Output
        printOutput(alphabetized);
    }

    public static void printOutput(List<String> output) {
        System.out.println("**********************************KWIC**********************************");
        for (String s : output) {
            System.out.println(s);
        }
    }
}