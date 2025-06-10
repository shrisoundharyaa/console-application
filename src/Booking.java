import java.util.*;
public class Booking {
    int bookingId, customerId, pickupPoint, dropPoint, amount;
    char from, to;

    public Booking(int bookingId, int customerId, char from, char to, int pickupPoint, int dropPoint, int amount) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.from = from;
        this.to = to;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.amount = amount;
    }
}

