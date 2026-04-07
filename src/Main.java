import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList( 4, 5, 7, 3, 2, 6);

        // Code reducing using Lambda Expression
        Consumer<Integer> con = n -> System.out.println(n);

        // Same as For Each Consumer<Integer> con = n -> System.out.println(n);
        nums.forEach(n -> System.out.println(n));









//        int sum = 0;
//        for (int n : nums) {
//            if (n % 2 == 0) {
//                n = n * 2;
//                sum = sum + n;
//            }
//        }
//
//            System.out.println(nums);
    }
}
