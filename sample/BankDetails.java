import java.util.Scanner;
/* @version 1.0 16 Aug 2022
 * @author Devaraj V
 */

abstract class Bank {

    abstract int bankDetails(); 
}

class IOB extends Bank {
    
    int bankDetails() {
        System.out.println();
        System.out.println("IOB USER");        
        Scanner amountDeposite = new Scanner(System.in);
        System.out.print("Enter the years to deposite : ");                     
        int deposite = amountDeposite.nextInt();        
        /* get the input from user */

        if (deposite>5) { 
            return 8;
        } else {
            return 5;
        }
    }
}

class CUB extends Bank {

    int bankDetails() {
        System.out.println();
        System.out.println("CUB USER");
        Scanner amountDeposite = new Scanner(System.in);
        System.out.print("Enter the years to deposite : "); 
        int deposite = amountDeposite.nextInt();
   
        if(deposite>5) {
            return 9;
        } else { 
            return 6;
        }
    }
}

class BankDetails {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" ****** Welcome ****** ");         
        Bank displayDetails;
        /* declare Bank dislayDetails common variable name
         * to access both IOB class and CUB class
         */
        displayDetails = new IOB();
        System.out.println("interest rate " +displayDetails.bankDetails() + " % ");

        displayDetails = new CUB();
        System.out.println("interest rate " +displayDetails.bankDetails() + " % ");
    }
}
    
    
    