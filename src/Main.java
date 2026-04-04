class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        super.showTheDataWhichBelongsToThisClass();
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}