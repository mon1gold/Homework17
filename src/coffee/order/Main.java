package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Bob");
        coffeeOrderBoard.add("Ban");
        coffeeOrderBoard.add("John");
        System.out.println(coffeeOrderBoard.deliver(4));
        coffeeOrderBoard.draw();
    }
}