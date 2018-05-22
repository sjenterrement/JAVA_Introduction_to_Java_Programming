package theComputerClass;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	public Account() {
	}

	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}

	// ·ÃÎÊÆ÷ºÍÐÞ¸ÄÆ÷
	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = (newId >= 0) ? newId : 0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newBalance) {
		balance = (newBalance >= 0) ? newBalance : 0;
	}

	public Date getDataCreated() {
		return dateCreated;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = (newAnnualInterestRate >= 0) ? newAnnualInterestRate : 0;
	}

	double getMonthlyInterest(double annualInterestRate) {
		return annualInterestRate / 12;
	}

	void withDraw(double withDraw) {
		balance -= withDraw;
	}

	void deposite(double deposite) {
		balance += deposite;
	}
	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1=new Account();
		account1.setId(1122);
		account1.setBalance(20000);
		account1.setAnnualInterestRate(4.5/100);
		account1.withDraw(2500);
		account1.deposite(3000);
		
		System.out.println("balance: "+account1.balance);
		System.out.println("monthly interest: "+account1.balance*account1.annualInterestRate/12);
		System.out.println("account date: "+account1.dateCreated);
		
	}
}
