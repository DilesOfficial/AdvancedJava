import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(4);
        nums.add(7);

        System.out.println(nums.indexOf(8));
        System.out.println(nums.get(0));

//        for (Object n : nums) {
//            int num = (Integer) n;
//            System.out.println(num*2);
//        }
    }
}
