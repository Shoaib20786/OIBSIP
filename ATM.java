import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        int balance = 50000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        System.out.println(" Please enter your card and User Name:");
        String Name = sc.next();
        System.out.println("Please enter your pin number: ");
        int password = sc.nextInt();
        int i = 1;
        if(password != pin) {
            while (true) {
                i++;
                System.out.println(" Sorry " + Name +" You have entered wrong pin Number!! ");
                System.out.println("Please Re-enter your pin (Max. Attempts :- 3) : ");
                password = sc.nextInt();
                if(password == pin) {
                    break;
                }
                if (i == 3) {
                    System.out.println("You have exceeded your trials !!! Retry After some time !");
                    System.exit(0);
                }
            }
        }
        System.out.println("<*------Welcome "  +Name +" to Our BANK ATM Services------*>");
        while (true) {
            System.out.println("Enter 1 -> to Check your Balance amount");
            System.out.println("Enter 2 -> to Withdraw Funds");
            System.out.println("Enter 3 -> to Deposit Funds");
            System.out.println("Enter 4 -> to Transfer Funds");
            System.out.println("Enter 5 -> to QUIT");
            System.out.print("Choose one of the option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Your Balance is : " + balance);
                    System.out.println(" ");
                }
                case 2 -> {
                    System.out.println("Enter the amount you want to Withdraw : ");
                    withdraw = sc.nextInt();

                    if (withdraw > balance || balance == 0) {
                        System.out.println("You have insufficient balance!!\n");
                        break;
                    }
                    System.out.println("Transaction successful collect your amount!");
                    balance = balance - withdraw;
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println(" ");
                }
                case 4 -> {
                    System.out.println("Enter the account number");
                    sc.nextLong();
                    System.out.println("enter the amount to be transfer");
                    int amount = sc.nextInt();
                    System.out.println("Enter 1-> To confirm\nEnter 2-> To Stop");
                    int select = sc.nextInt();
                    if (select == 1) {

                        balance -= amount;
                        System.out.println("\"Amount Transferred Successfully \"");
                    } else if (select == 2) {
                        System.out.println("transaction cancelled");
                    }
                }
                case 5 -> {
                    System.out.println("Thank you for using our ATM!" );
                    System.exit(0);
                }
            }
        }
    }

}