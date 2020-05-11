
public class AccountTester {

	public static void main(String[] args) {
		/* Tests Account class by creating an Account object with
		an ID of 1122, a balance of $20,000, and an annual interest
		rate of 4.2%. Use the withdraw method to withdraw $2,500
		and the deposit method to deposit $3,000. Print the balance,
		the monthly interest, and the date the account was created.*/
		
		Account myAcc = new Account(1122, 20000);
		myAcc.setAnnualInterestRate(4.2);
		myAcc.withdraw(2500);
		myAcc.deposit(3000);
		System.out.printf("This account has a balance of %.2f\n", myAcc.getBalance());
		System.out.printf("The monthly interest rate is %.2f\n", myAcc.getMonthlyInterestRate());
		System.out.println("This account was created on " + myAcc.getDateCreated());

	}

}
