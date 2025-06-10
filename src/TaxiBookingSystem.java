import java.util.*;
public class TaxiBookingSystem {
      static  List<Taxi> taxis = new ArrayList<>();
      static Scanner in = new Scanner(System.in);
      static int customerCount = 1;
      public static void main(String[] args){
          System.out.print("enter number of taxis :");
          int numTaxis = in.nextInt();
          initializeTaxi(numTaxis);
          while(true){
              System.out.print("\n1.booking taxi \n2.display the details \n3.exit");
              System.out.print("enter your choice: ");
              int choice = in.nextInt();
              switch(choice){
                  case 1:
                      bookingTaxi();
                      break;
                  case 2:
                      displaydetails();;
                      break;
                  case 3:
                       System.out.println("your are exit...");
                       return;
                  default:
                      System.out.print("invalid choice enter correctly..");
              }
          }
    }
     public static void initializeTaxi(int n){
          for(int i = 1; i <=n;i++){
              taxis.add(new Taxi(i));
          }
     }
     public static void bookingTaxi(){
          int customerId = customerCount++;
          System.out.print("enter pickup Point : ");
          char pickUp = in.next().toUpperCase().charAt(0);
          System.out.print("Enter your drop point : ");
          char drop  = in.next().toUpperCase().charAt(0);
          System.out.println("tell your pickupTime : ");
          int pickupTime = in.nextInt();
          Taxi selectedTaxi = null;
          int minDistance = Integer.MAX_VALUE;



     }
    public static void displaydetails(){

    }

}