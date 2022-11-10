public class Account {

    //Instance (has a)
private int balance;
private int amountWithdrawn;


    //Constructor
    // GETTER and SETTER for Balance
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // GETTER and SETTER for amountWithdrawn
    public int getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void setAmountWithdrawn(int amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }
    // Used constructor below
    public Account(int balance) {
        this.balance = balance;
    }

    //Method (can do)
    public void withdraw(int amount){
        if (amount <= this.balance){
            //if true, then subtract this amount from the balance
            this.balance -= amount;
            this.amountWithdrawn += amount;
            System.out.println(amount + " withdrawn. New balance " + this.balance + ". Total withdrawn: " + this.amountWithdrawn);
        } else {
            System.out.println("Insufficient funds. Total withdrawn: " + this.amountWithdrawn);
        }





    }




}
