enum Laptop {
    MacBook(2000), XPS(2200), Surface, ThinkPad(1200);

    private int price;

    private Laptop() {
        price = 200;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
//        Laptop lap = Laptop.MacBook;
//        System.out.println(lap + " : " + lap.getPrice());

        for (Laptop laps : Laptop.values()) {
            System.out.println(laps + " : " + laps.getPrice());
        }
    }
}