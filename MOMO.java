


package vu.momo;

import java.util.Scanner;
public class MOMO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to MTN Mobile Money!");
       System.out.println("============================================");
       System.out.println("Select the Best Option \n1: Send Money\n2: Airtime/Bundles\n3:Withdraw Money\n4: Pay Bills \n5: Make Payment");
       int option = input.nextInt();
      
        String phoneNumber;
        double amount;
        int pin;
       switch(option){
           case 1:
               System.out.println("Send Money");
               System.out.print("Enter the Mobile Number: ");
                phoneNumber = input.next(); 
                
                System.out.print("Enter the Amount: ");
                amount = input.nextDouble();
                
                System.out.print("Enter your PIN to confirm: ");
                pin = input.nextInt();
                
                System.out.println("\n Amount of UGX " + amount + " Has Been Successfully Sent To " + phoneNumber + ".");
               break;
               
             case 2:
               System.out.println("Airtime/Bundles");
               System.out.print("Enter airtime amount: ");
                amount = input.nextDouble();
                
                System.out.print("Enter Your PIN: ");
                pin = input.nextInt();
                
                System.out.println("\nSuccess Airtime of UGX " + amount + " loaded "+ ".");
                break;
               
               
            case 3:
               System.out.println("Withdraw Money");
                
                System.out.print("Enter amount to withdraw: ");
                amount = input.nextDouble();
                
                System.out.print("Enter your PIN: ");
                pin = input.nextInt();

                
                System.out.println("\nSuccess The Amount of UGX " + amount + " Withdrew " + ".");
               break;
               
            case 4:
               System.out.println("Pay Bills");
               System.out.println("1: Umeme");
                System.out.println("2: Water");
                System.out.print("Choose utility: ");
                //int billOption = input.nextInt();
                
                System.out.print("Enter Account Number: ");
                String accountNum = input.next();
                
                System.out.print("Enter amount: ");
                amount = input.nextDouble();
                
                System.out.print("Enter your PIN: ");
                pin = input.nextInt();
                
                System.out.println("\nBill payment of UGX " + amount + " Was Successfully Payed.");
               break;
               
               case 5:
                System.out.println("\n Make Payment");
                System.out.print("Enter Merchant Code: ");
                int merchantCode = input.nextInt();
                
                System.out.print("Enter amount: ");
                amount = input.nextDouble();
                
                System.out.print("Enter PIN: ");
                pin = input.nextInt();
                
                System.out.println("\nPayment of UGX " + amount + " to Merchant " + merchantCode + " successfully Sent.");
                break;
               
            default:
               System.out.println("Invalid option selected. Please try again.");
               
               
       }
    }
}
