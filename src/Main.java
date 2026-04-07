import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Sansa");

//        Optional<String> name = names.stream()
//                .filter(str -> str.contains("x"))
//                .findFirst();
//
//        System.out.println(name.orElse("Not Found"));

        // dewidihatama karanna puluwan
        String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name);
    }
}
