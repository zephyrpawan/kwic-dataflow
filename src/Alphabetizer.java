import java.util.List;

public class Alphabetizer implements Filter<List<String>>{
    @Override
    public List<String> execute(List<String> input) {
        input.sort(String.CASE_INSENSITIVE_ORDER);
        return input;
    }
}
