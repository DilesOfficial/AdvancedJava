@FunctionalInterface
interface A {
    int add(int i,  int j);
}

    public class Main {
        public static void main(String[] args) {
            A obj = (int i, int j) -> {
                return i + j;
            };
            int result = obj.add(1, 2);
            System.out.println(result);
    }
}