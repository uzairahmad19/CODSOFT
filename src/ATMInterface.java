import java.util.Scanner;

class ATM{
    private Account account;
    public ATM(Account account){
        this.account = account;
    }
    public void withdraw(int amount){
        if(account.getBalance()>=amount){
            account.setBalance(account.getBalance() - amount);
            System.out.println("Success..");
        }
        else System.out.println("Transaction Failed...\nInsufficient Funds in you Account");
    }
    public void deposit(int amount){
        account.setBalance(account.getBalance() + amount);
        System.out.println("Amount Deposited Successfully...");
    }
    public int checkBalance(){
        return account.getBalance();
    }
}
class Account{
    private int balance;
    public Account(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        Account account = new Account(0);
        ATM atm = new ATM(account);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("PRESS 1 TO WITHDRAW\nPRESS 2 TO DEPOSIT\nPRESS 3 TO CHECK BALANCE\nPRESS 4 TO EXIT");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Enter Amount to withdraw:");
                int amount = sc.nextInt();
                atm.withdraw(amount);
            }else if(ch==2){
                System.out.println("Enter Amount to deposit:");
                int amount = sc.nextInt();
                atm.deposit(amount);
            } else if (ch==3) {
                System.out.println("Your Balance is: Rs." + atm.checkBalance());
            }else break;
        }
    }
}
