package exercise5;

import java.util.List;
import java.util.stream.Collectors;
public class Main {

    public static List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "ant", "bat", "art", "arc", "acting", "ace");
        System.out.println("Filtered List: " + filterStrings(words));
    }
}