import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Dilusha", 78);
        students.put("Sahan", 45);
        students.put("Thamindu", 63);
        students.put("Vishal", 23);
        students.put("Sahan", 66);

        for (String key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }

    }
}
