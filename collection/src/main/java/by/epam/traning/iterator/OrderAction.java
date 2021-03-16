package by.epam.traning.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderAction {
    public void discountAction(float bigAmount, List<Order> orders, int percent) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (bigAmount >= order.getAmount()) {
                iterator.remove();
            } else {
                order.setAmount(order.getAmount() * (100 - percent) / 100.0);
            }
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add(new String("hello"));
        Map<String, String> map = new HashMap<>();
        map.put("22","hello");
        map.put("33", "andrey");
        map.put("22", "hello");

        System.out.println(map);

        Set<String> set = new HashSet<>();
        set.add("hello");
    }
}
