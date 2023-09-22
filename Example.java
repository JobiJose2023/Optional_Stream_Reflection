import java.util.Optional;

public class Example {
    public Optional<Double> calculateAverage(Double[] score) {

        if (score.length == 0)
            return Optional.empty();

        double total = 0;
        for (Double d : score) {
            total += d;
        }

        return Optional.of(total / score.length);
    }
}