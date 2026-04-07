import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Sansa");

        List<String> uNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        uNames.forEach(System.out::println);
    }
}
