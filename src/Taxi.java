import java.util.*;
public class Taxi {
    int id;
    char CurrrentPoint = 'A';
    int totalEarnings = 0;
    List<Booking> bookings = new ArrayList<>();
     public Taxi(int id){
         this.id = id;
     }
     public boolean isAvailable(int requestTime){
         if(bookings.isEmpty()) return true;
         Booking lastBooking = bookings.get(bookings.size() - 1);
         return lastBooking.DropTime <= requestTime;
     }
     public int calculateEarnings(char from , char to){
         int distance = Math.abs(from - to) * 15;
         return 100 + Math.max(0,(distance - 5) * 10);
     }
     public void addBooking(Booking booking){
         bookings.add(booking);
         totalEarnings += booking.Amount;
         CurrrentPoint = booking.to;
     }


}