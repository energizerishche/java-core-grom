package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {

    public static Order createOrder() {
        return new Order(
                100,
                new Date(),
                false,
                null,
                "Dnepr",
                "Ukraine",
                "Buy"
        );
    }

    public static Order createOrderAndCallMethods() {
        Order order = new Order(
                100,
                new Date(),
                true,
                new Date(),
                "Kiev",
                "Ukraine",
                "SomeValue"
        );

        order.checkPrice();
        order.isValidType();
        order.confirmOrder();

        return order;
    }
}
