interface A {
    int age = 44;  // All the variables in interfaces final and static
    String area = "Colombo";

    void show();
    void config();
}

class B implements A {
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

    public class Main {
        public static void main(String[] args) {
            A obj = new B();
            obj.show();
            obj.config();

            // Static variable in interface can directly access without objects
            System.out.println(A.area);
    }
}