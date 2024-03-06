package task3;

public class BankAccount {
	 private double balance;

	 public BankAccount( double balance) {
	      
	        this.balance = balance;
	    }
	 

	    public double getBalance() {
	        return balance;
	    }
	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Invalid amount. Please enter a positive value.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Invalid amount or insufficient funds.");
	        }
	    }
}
