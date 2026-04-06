@FunctionalInterface
interface A {
    void show(int i);
}

    public class Main {
        public static void main(String[] args) {
            A obj = i -> System.out.println("In Show " + i);
            obj.show(5);
    }
}