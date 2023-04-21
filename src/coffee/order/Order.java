package coffee.order;

import java.util.Objects;

public class Order {
    private String name;
    private int orderNumber;

    public Order(String name, int orderNumber) {
        this.name = name;
        this.orderNumber = orderNumber;

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orderNumber);
    }
}
