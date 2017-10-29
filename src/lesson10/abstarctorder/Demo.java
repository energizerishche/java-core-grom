package lesson10.abstarctorder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        ElectronicsOrder eOrder = new ElectronicsOrder(
            "TV",
            new Date(),
            "Киев",
            "Киев",
            5000,
            new Customer("Игорь", "Киев", "Мужской"),
            24
        );

        ElectronicsOrder eOrder2 = new ElectronicsOrder(
                "X-box",
                new Date(),
                "Киев",
                "Киев",
                3000,
                new Customer("Игорь", "Киев", "Мужской"),
                12
        );

        FurnitureOrder fOrder = new FurnitureOrder(
            "Тумба",
            new Date(),
            "Киев",
            "Одесса",
            900,
            new Customer("Рабинович", "Одесса", "Мужской"),
            "T0Y64"
        );

        FurnitureOrder fOrder2 = new FurnitureOrder(
                "Шкаф",
                new Date(),
                "Киев",
                "Львов",
                900,
                new Customer("Елена", "Львов", "Женский"),
                "S0B04"
        );

        order(eOrder);
        order(eOrder2);
        order(fOrder);
        order(fOrder2);
    }

    protected static void order(Order order) {
        order.validateOrder();
        order.calculatePrice();
        order.confirmShipping();

        System.out.println(order.getItemName() + " ordered");
    }
}
