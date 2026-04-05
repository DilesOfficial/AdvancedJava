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
//            A obj = /* cut this because for lambda expression new A(){
//                public void show*/() -> {
//                    // Anonymous Inner class
//                    System.out.println("In Show");
//            };
//            obj.show();

            // Same part in line 13-18 reduced the code
            A obj = () -> System.out.println("In Show");
            obj.show();
    }
}