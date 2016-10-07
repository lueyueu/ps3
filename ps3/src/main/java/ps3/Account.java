package ps3;

import java.util.Date;

import exceptions.InsufficientFundsException;

public class Account {
	/**
	 * id, balance ,annualInterestRate, dateCreated 
	 * 4 private data field
	 */
	private int id;
	private double balance; 
	private double annualInterestRate;
	private Date dateCreated;
	
	
	/**
	 * A constructor that creates an account with the specified id and initial balance.
	 */
	Account(int id, double initialbalance){
		this.id=id;
		this.balance=initialbalance;
		this.dateCreated = new Date();
		
	}
	
	/**
	 * * A no-arg constructor that creates a default account
	 */
	Account(){	
		id = 0;
		balance = 0;
		annualInterestRate=0;
		this.dateCreated = new Date();
		
	}
	
	/**
	 * The accessor and mutator methods for id, balance, and annualInterestRate. 
	 * The accessor method for dateCreated.
	 * @param id
	 */
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}  

	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
		
	}
	
	/**
	 * 	A method named getMonthlyInterestRate() that returns the monthly interest rate.
	 * @return
	 */
	public double getMonthlyInterestRate(){
		return getAnnualInterestRate()/12;
		
		
	}
	
	/**
	 * A method named withdraw that withdraws a specified amount from the account.
	 * @param amount
	 * @return
	 * @throws InsufficientFundsException
	 */
	
	public double withdraw(double amount) throws InsufficientFundsException{
		
		if (amount<=this.getBalance()){
			return amount;
		}
		else{
			amount=this.getBalance()-amount;
			throw new InsufficientFundsException(amount);
			
		}
	}


	
	/**
	 * A method named deposit that deposits a specified amount to the account.
	 * @param amount
	 * @return
	 */

	public double deposit(double amount){
		this.setBalance(this.getBalance()+amount);
		return this.getBalance();
	}
   
	
}

