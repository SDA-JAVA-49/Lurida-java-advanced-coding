package exercise4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        List<String> uppercaseStrings = colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nUppercase Strings: " + uppercaseStrings);
    }
}