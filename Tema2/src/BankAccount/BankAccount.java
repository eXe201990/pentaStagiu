package BankAccount;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(){
        this.balance = 0;
        this.name = "Default name";
    }


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }



    public void setName(String name){
        this.name = name;
        System.out.println("Your new account is " + name);
    }

    public void addFounds(float amount){
        if(amount > 0){
            this.balance += amount ;
            System.out.println("Your new balance  " + this.balance);
        }else{
            System.out.println("The founds " + amount + " that you are trying to add don't represent a valid amount");

        }
    }

    public void withrawFounds(float ammount){
        if(this.balance - ammount < 0){
            System.out.println("The amount that you are trying to withdraw: " + ammount + " is not available. Your available funds: " + this.balance);
        }else{
            this.balance -= ammount;
            System.out.println("You made a withdraw of " + ammount + " and your remaining balance is: " + this.balance);
        }
    }
}
