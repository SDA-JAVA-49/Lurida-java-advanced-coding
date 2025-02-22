package exercise6;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNumberFormatter {
    public static String formatNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 44, 7, 18, 25);
        System.out.println("Formatted Output: " + formatNumbers(numbers));
    }
}