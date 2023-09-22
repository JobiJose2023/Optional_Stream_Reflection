import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream_Example {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Sample", "Example");
        List<String> UpperCase = sampleList.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        for (String string : UpperCase) {

            System.out.println(string);
        }
    }
}