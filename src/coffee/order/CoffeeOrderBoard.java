package coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    private Queue<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        this.orders = new LinkedList<>();
        this.nextOrderNumber = 1;
    }

    public void add(String name) {
        Order order = new Order(name, nextOrderNumber);
        orders.add(order);
        nextOrderNumber++;
    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int nextOrderNumber) {
        Order order = null;
        for (Order element : orders) {
            if (element.getNumber() == nextOrderNumber) {
                order = element;
                break;
            }
        }
        if (order != null) {
            orders.remove(order);
        }
        return order;
    }

    public void draw() {
        System.out.println("Num\t| Name");

        for (Order order : orders) {
            System.out.println(order.getNumber() + "\t| " + order.getName());
        }
    }
}
//        6. Реалізувати метод draw у класі CoffeeOrderBoard.
//        Цей метод виводить у консоль інформацію про поточний стан черги у порядку найближчого до видачі замовлення.
//
//        Наприклад:
//
//        =============
//
//        Num | Name
//
//        4 | Alen
//
//        27 | Yoda
//
//        33 | Obi-van
//
//        34 | John Snow