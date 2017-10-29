package lesson11.roomsearchapi;

public class BookingComAPI implements API {
    private Room[] rooms;

    private final int priceRange = 100;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int counter = 0;
        Room[] tempResult = new Room[rooms.length];

        for (Room room : rooms) {
            if (room != null
                && persons > 0
                && persons == room.getPersons()
                && city != null
                && city.equals(room.getCityName())
                && hotel != null
                && hotel.equals(room.getHotelName())
                && isPriceSuitable(price, room.getPrice())
            ) {
                tempResult[counter] = room;
                counter++;
            }
        }

        Room[] result = new Room[counter];

        counter = 0;
        for (Room room : tempResult) {
            if (room != null) {
                result[counter] = room;
                counter++;
            }
        }

        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

    private boolean isPriceSuitable(int requestedPrice, int roomPrice) {
        return roomPrice >= 0
            && (requestedPrice >= (roomPrice - priceRange))
            && (requestedPrice <= (roomPrice + priceRange));
    }
}
