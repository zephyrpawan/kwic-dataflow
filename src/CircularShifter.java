import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularShifter implements Filter<List<String>>{

    @Override
    public List<String> execute(List<String> inputLines) {
        List<String> shiftedLines = new ArrayList<String>();
        for (String inputLine : inputLines) {
            String[] words = inputLine.split(" ");
            for(int i = 0; i < words.length; i++) {
                String firstPart = String.join(" ", Arrays.copyOfRange(words, i, words.length));
                String secondPart = String.join(" ", Arrays.copyOfRange(words, 0, i));
                shiftedLines.add(String.join(" ", firstPart, secondPart).strip());
            }
        }

        return shiftedLines;
    }
}
