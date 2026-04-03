abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying");
    }
}


public class Main {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}