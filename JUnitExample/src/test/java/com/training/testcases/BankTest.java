package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegValueException;

class BankTest {

		Bank bank;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Test");
		bank=new Bank(8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Test");
		bank=null;
	}

	@Test
	void testWithdraw() throws ExceedingException {
		double balance=bank.withdraw(2000);
		assertEquals(6000, balance,"Should be 6000");
		//fail("Not yet implemented");
	}
	
	@Test
	void testWithdrawExceeding() {
		//double balance=bank.withdraw(4000);
		assertThrows(ExceedingException.class, ()->bank.withdraw(4100));
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testWithdrawNeg()
	{
		assertThrows(NegValueException.class,()->bank.withdraw(-900));
	}
	@Test
	void testDeposit() {
		double balance=bank.deposit(2000);
		assertEquals(10000, balance,"Should be 12000");
		//fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test deposit")
	void testdepositExceeding() {
		//double balance=bank.withdraw(4000);
		assertThrows(ExceedingException.class, ()->bank.deposit(50000));
		
		//fail("Not yet implemented");
	}
	
	@Test
	void depositNeg()
	{
		assertThrows(NegValueException.class,()->bank.withdraw(-900));
	}
	
	
}
