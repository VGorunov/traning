package by.epam.traning.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>() {
            {
                add(new Order(1, 43.2));
                add(new Order(15, 20.5));
                add(new Order(5, 90.3));
            }
        };
        System.out.println(orders);

        // Выберем из коллекции все элементы, сумма заказов которых привышает
        // заданное число и сделаем на все эти заказы некоторую скидку

        float bigAmount = 10;
        int percent = 5;
        OrderAction action = new OrderAction();
        action.discountAction(bigAmount, orders, percent);
        System.out.println(orders);


        // c помощью Java 8
        orders.removeIf(order -> order.getAmount() <= bigAmount);
        orders.forEach(order -> order.setAmount(order.getAmount() * (100 - percent) / 100.0));
    }
}
