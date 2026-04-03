class A {
    int age;

    public void show() {
        System.out.println("show");
    }

    static class B {
        public void config() {
            System.out.println("config");
        }
    }
}


    public class Main {
        public static void main(String[] args) {
            A obj = new A();
            obj.show();
            A.B obj2 = new A.B();
            obj2.config();
    }
}