import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Example ex = new Example();
        Double[] score = {};
        Optional<Double> avg = ex.calculateAverage(score);

        if (avg.isPresent()) {
            System.out.println("The Avg. Score is: " + avg.get());
        } else {
            System.out.println("No Scores Provided!");
        }
    }
}
