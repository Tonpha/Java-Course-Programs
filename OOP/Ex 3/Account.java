import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	Account(){
		dateCreated = new Date();
	}
	
	Account(int newID, double newBalance){
		id = newID;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	int getID() {
		return id;
	}
	
	void setID(int newID) {
		id = newID;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	void setAnnualInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
	
	Date getDateCreated() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return balance * (annualInterestRate / 100);
	}
	
	void withdraw(double amount) {
		balance -= amount;
	}
	
	void deposit(double amount) {
		balance += amount;
	}

}
