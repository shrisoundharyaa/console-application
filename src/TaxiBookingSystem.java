import java.util.*;

public class TaxiBookingSystem {
    static List<Taxi> taxis = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    static int CustomerCount = 1;

    public static void main(String[] args) {
        System.out.print("Enter Number of taxi : ");
        int numTaxis = in.nextInt();
        initializeTaxis(numTaxis);
        while (true) {
            System.out.print("\n1.Booking taxi \n2.Booking details  \n3.Exit\n");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    BookingTaxi();
                    break;
                case 2:
                    displayDetails();
                    break;
                case 3:
                    System.out.println("Program Exit...");
                    return;
                default:
                    System.out.println("invalid choice ... choose correct");

            }
        }
    }

    public static void initializeTaxis(int n) {
        for (int i = 1; i <= n; i++) {
            taxis.add(new Taxi(i));
        }
    }

    public static void BookingTaxi() {
        int CustomerId = CustomerCount++;
        System.out.print("Enter your Pickup point(A - F): ");
        char pickUp = in.next().toUpperCase().charAt(0);
        System.out.print("Enter your Drop point(A - F): ");
        char drop = in.next().toUpperCase().charAt(0);
        System.out.print("Enter your PickupTime(in hours) : ");
        int PickupTime = in.nextInt();
        Taxi selectedTaxi = null;
        int minDistance = Integer.MAX_VALUE;
        for (Taxi taxi : taxis) {
            if (taxi.isAvailable(PickupTime)) {
                int distance = Math.abs(taxi.CurrrentPoint - pickUp);
                if (distance < minDistance ||
                        (distance == minDistance && taxi.totalEarnings < selectedTaxi.totalEarnings)) {
                    selectedTaxi = taxi;
                    minDistance = distance;
                }
            }
        }
        if (selectedTaxi == null) {
            System.out.println("No taxi available .. you booking is rejected");
            return;
        }
        int DropTime = PickupTime + Math.abs(drop - pickUp);
        int Amount = selectedTaxi.calculateEarnings(pickUp, drop);
        int BookingId = selectedTaxi.bookings.size() + 1;
        Booking booking = new Booking(BookingId, CustomerId, pickUp, drop, PickupTime, DropTime, Amount);
        selectedTaxi.addBooking(booking);
        System.out.println("Taxi-" + selectedTaxi.id + " is selected");

    }
    public static void displayDetails(){
        for(Taxi taxi : taxis){
            System.out.println("Taxi- " + taxi.id + " totalEarnings : Rs. " + taxi.totalEarnings);
            System.out.printf("%-10s %-10s %-5s %-5s %-12s %-9s %-6s%n",
                    "BookingId" , "CustomerId"  , "From" , "To" , "PickupTime" , "DropTime" , "Amount");
            for(Booking booking : taxi.bookings){
                System.out.printf("%-10d %-10d %-5c %-5c %-12d %-9d %-6d%n",
                        booking.BookingId , booking.CustomerId,booking.from, booking.to,booking.PickupTime,
                        booking.DropTime,booking.Amount);
            }
        }
    }
}