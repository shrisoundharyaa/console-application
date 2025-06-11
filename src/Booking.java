public class Booking {
    int BookingId , CustomerId,PickupTime,DropTime,Amount;
    char from,to;
    public Booking(int BookingId , int CustomerId,char from,char to , int PickupTime , int DropTime, int Amount){
        this.BookingId = BookingId;
        this.CustomerId = CustomerId;
        this.from = from;
        this.to = to;
        this.PickupTime = PickupTime;
        this.DropTime = DropTime;
        this.Amount = Amount;
    }
}