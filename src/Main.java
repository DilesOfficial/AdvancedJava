import java.util.*;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Comparator<Student> com = (i,j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Dilusha",43));
        studs.add(new Student("Kalhara",55));
        studs.add(new Student("Nisansala",42));
        studs.add(new Student("Madun",22));

        Collections.sort(studs, com);
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
