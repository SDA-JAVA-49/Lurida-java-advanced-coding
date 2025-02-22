package exercise3;

import java.util.List;
import java.util.OptionalDouble;

public class DoubleAverage {
    public static double getAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        System.out.println("Average: " + getAverage(numbers));
    }
}
