package lesson11.roomsearchapi;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int resultLength = 0;

        for (API api : apis) {
            resultLength += api.getAll().length;
        }

        Room[] tempResult = new Room[resultLength];
        int counter = 0;

        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                tempResult[counter] = room;
                counter++;
            }
        }

        Room[] result = new Room[counter];

        for (Room room : tempResult) {
            if (room != null) {
                result[counter] = room;
            } else {
                break;
            }
        }

        return result;
    }

    public Room[] check(API api1, API api2) {
        Room[] tempResult = new Room[api1.getAll().length];

        int counter = 0;
        int resultArraysLength = 0;

        for (Room roomFromApi1 : api1.getAll()) {
            for (Room roomFromApi2 : api2.getAll()) {
                if (roomFromApi1 != null
                    && roomFromApi2 != null
                    && roomFromApi1.getPersons() > 0
                    && roomFromApi1.getPersons() == roomFromApi2.getPersons()
                    && roomFromApi1.getCityName() != null
                    && roomFromApi1.getCityName().equals(roomFromApi2.getCityName())
                    && roomFromApi1.getPrice() > 0
                    && roomFromApi1.getPrice() == roomFromApi2.getPrice()
                    && roomFromApi1.getHotelName() != null
                    && roomFromApi1.getHotelName().equals(roomFromApi2.getHotelName())
                ) {
                    tempResult[counter] = roomFromApi1;
                    resultArraysLength++;
                    break;
                }
            }
            counter++;
        }

        counter = 0;
        Room[] result = new Room[resultArraysLength];
        for (Room room : tempResult) {
            if (room != null) {
                result[counter] = room;
                counter++;
            }
        }

        return result;
    }
}
