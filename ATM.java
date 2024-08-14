import java.util.Random;
import java.util.Scanner;
public class ATM{
       private Useraccount acount;
       private Scanner scanner;

    public ATM() {
        acount=new Useraccount();
        scanner = new Scanner(System.in);
    }

    
    public void start(){
        int choice;
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        
        do {            
            Menu();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.println("enter how much amount to deposit in your account");
                    Double amo;
                    amo=scanner.nextDouble();
                    deposit(amo);
                    break;
                case 3:
                    System.out.println("enter how much amount to withdraw from your account");
                    Double amo1;
                    amo1=scanner.nextDouble();
                    withdraw(amo1);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option!");
            }
        } while (choice != 4);
    }
    static void Menu(){
        System.out.println("WELCOME TO ATM");
        System.out.println("Menu of the ATM");
        System.out.println("1.check balance");
        System.out.println("2.deposit money");
        System.out.println("3.withdraw money");
        System.out.println("exit");
    }
    static void checkBalance(){
            System.out.println("current balance in your account is "+acount.getbalance());
    }
    static double deposit(double a){
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        System.out.println("money deposited "+acount.dodeposit(amount));
    }
    static double withdraw(double b){
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        System.out.println("money withdrawed "+acount.dowithdraw(amount));
    }
    
}
class Useraccount{
    private int number;
    static double balance;
    public Useraccount(){
        Random random=new Random();
        number=random.nextInt(10000000);
        balance=number+1;
    } 
    static double getbalance(){
        return balance;
    }
    static double dodeposit(double s){
            if(balance>0){
            balance+=s;
            return balance;}
    }
    static double dowithdraw(double y){
        if(balance>0 && balance>amount){
        balance-=y;
        return balance;}
    }
}