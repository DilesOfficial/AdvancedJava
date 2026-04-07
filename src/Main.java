import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(52);
        nums.add(81);
        nums.add(46);
        nums.add(79);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

//        for (int n : nums) {
//            System.out.println(n);
//        }
    }
}
