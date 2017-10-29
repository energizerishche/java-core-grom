package lesson10.abstarctorder;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    private String[] validShipFromCities = {"Киев", "Львов"};

    public FurnitureOrder(
        String itemName,
        Date dateCreated,
        String shipFromCity,
        String shipToCity,
        int basePrice,
        Customer customerOwned,
        String furnitureCode
    ) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        if (getBasePrice() >= 500
            && getItemName() != null
            && getItemName().length() > 0
            && getDateCreated() != null
            && furnitureCode != null
            && furnitureCode.length() > 0
            && getShipToCity() != null
            && inArray(getShipToCity(), validShipFromCities)
            && getCustomerOwned() != null
            && getCustomerOwned().getName() != null
            && !getCustomerOwned().getName().equals("Тест")
            && getCustomerOwned().getGender() != null
            && getDateShipped() == null
            && getCustomerOwned().getCity() != null
        ) {
            setDateConfirmed(new Date());
        }
    }

    @Override
    void calculatePrice() {
        setTotalPrice(getBasePrice() + getShipmentPrice());
    }

    public String getFurnitureCode() {
        return this.furnitureCode;
    }

    private double getShipmentPrice() {
        return getBasePrice() < 5000 ? getBasePrice() * 0.05 : getBasePrice() * 0.02;
    }
}
