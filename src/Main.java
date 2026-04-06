/* Lambda Expression only works with Functional Interface if you
have multiple it's not work */

@FunctionalInterface
interface A {
    int add(int i,  int j);
}
    public class Main {
        public static void main(String[] args) {
            A obj = (i,j) -> i + j;
            int result = obj.add(1, 2);
            System.out.println(result);
    }
}