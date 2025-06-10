import java.util.*;
public class Taxi{
    int id;
    char currentPoint = 'A';
    int totalEarning = 0;
    static List<Booking> bookings = new ArrayList<>();

    public Taxi(int id){
        this.id = id;
    }
}
