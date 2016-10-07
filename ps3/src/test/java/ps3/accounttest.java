package ps3;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.InsufficientFundsException;

public class accounttest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	Account testAccount=new Account();
	Account account1=new Account(0,0.00);
	public double amount;
	

	
	@Test
	public void testId() throws Exception{
		int id = 1122;
		testAccount.setId(id);
		assertEquals(testAccount.getId(), id,0.01);
		System.out.println("The ID number is "+testAccount.getId());
	}
	

	@Test
	public void testBalance() throws Exception{
		double balance=20000;
		testAccount.setBalance(balance);
		assertEquals(testAccount.getBalance(), balance,0.001);
		System.out.println("The Balance on your account is $"+testAccount.getBalance());
	}
  

	@Test
	public void testannualinterest() throws Exception{
		 double annualinterestrate=4.5;
		 testAccount.setAnnualInterestRate(annualinterestrate);
		 assertEquals(testAccount.getAnnualInterestRate(),annualinterestrate,0.001);
	}
	
	@Test
	public void testmonthlyinterest() throws Exception{
		double monthlyrate=0.375;
		testAccount.setAnnualInterestRate(4.5);
		assertEquals(testAccount.getAnnualInterestRate()/12,monthlyrate,0.001);
		System.out.println("The Monthly interest rate "+testAccount.getMonthlyInterestRate()+"%");
		
	}
	
	
	@Test 
	public void testdeposit(){
		double deposit=3000;
		testAccount.deposit(deposit);
		assertEquals(testAccount.getBalance(),deposit,0.001);
		System.out.println("you have deposit $"+testAccount.getBalance()+" to your account");
	}
	
	@Test
	public void printdate() throws Exception {
		System.out.println("The Date the account was created "+testAccount.getDateCreated());
		System.out.println(account1);
	}
	
	
	
	
	@Test
	public void testwithdraw() throws Exception{
		double withdrawamount=2500.00;
		double deposit=3000;
		testAccount.deposit(deposit);
		testAccount.withdraw(withdrawamount);
	}
	
	
		
	@Test(expected=InsufficientFundsException.class)
	public void testwithdrawfailed() throws InsufficientFundsException {
		
		double withdrawamount=2500.00;  
		double deposit=2000;
		testAccount.deposit(deposit);
		testAccount.withdraw(withdrawamount);
		
	}
	@Test
	public void testexp() throws Exception{
		double withdrawamount=2500.00;  
		double deposit=2000;
		amount=testAccount.deposit(deposit)-withdrawamount;
		InsufficientFundsException excep=new InsufficientFundsException(amount);
		excep.getAmount();
		
		
	}
	
	
	}

	
		
		


	
	
		
	

	


	
	
	

	
	

	

	