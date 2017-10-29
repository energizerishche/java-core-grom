package lesson10.abstarctorder;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    private final String[] validCities = {"Киев", "Одесса", "Днепр", "Харьков"};
    private final int minPrice = 100;

    public ElectronicsOrder(
            String itemName,
            Date dateCreated,
            String shipFromCity,
            String shipToCity,
            int basePrice,
            Customer customerOwned,
            int guaranteeMonths
    ) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getBasePrice() >= minPrice
            && getItemName() != null
            && getItemName().length() > 0
            && getDateCreated() != null
            && getCustomerOwned() != null
            && getCustomerOwned().getGender() != null
            && getCustomerOwned().getGender().equals("Женский")
            && inArray(getShipFromCity(), validCities)
            && inArray(getShipToCity(), validCities)
            && getCustomerOwned().getName() != null
            && guaranteeMonths > 0
            && getDateShipped() == null
            && getCustomerOwned().getCity() != null
        ) {
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        setTotalPrice(getBasePrice() + getShipmentPrice());

        if (getBasePrice() > 1000) {
            setTotalPrice(getTotalPrice() - getTotalPrice() * 0.05);
        }
    }

    public int getGuaranteeMonths() {
        return this.guaranteeMonths;
    }

    private double getShipmentPrice() {
        String[] discountedShipmentTo = {"Киев", "Одесса"};

        return getShipToCity() != null && inArray(getShipToCity(),  discountedShipmentTo)
                ? getBasePrice() * 0.1
                : getBasePrice() * 0.15;
    }
}
