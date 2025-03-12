package Bus_reservation;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int useropt = 1;
        while(useropt == 1){
            System.out.println("enter 1 for booking or 2 for exit");
            useropt = scan.nextInt();
            while(useropt == 1){
                System.out.println("your ticket is booked");
            }
        }
    }
}
