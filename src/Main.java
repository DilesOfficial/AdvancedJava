@FunctionalInterface
interface A {
    void show();
}

//class B implements A {
//    public void show(){
//        System.out.println("in show");
//}

    public class Main {
        public static void main(String[] args) {
            A obj = new A(){
                public void show(){
                    // Anonymous Inner class
                    System.out.println("In Show");
                }
            };
            obj.show();
    }
}