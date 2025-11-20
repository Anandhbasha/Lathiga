class BankAccount{
    private double balance;
    public String userID;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
        }else{
            System.out.println("Invalid Amount to withdraw");
        }
    }
    public double showBal(){
        return balance;
    }
}
public class encap{
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.userID="IB0100152";
        System.out.println(user1.showBal());
        user1.deposit(2000);
        user1.withdraw(500);
        System.out.println(user1.userID);
        System.out.println(user1.showBal());
    }
}