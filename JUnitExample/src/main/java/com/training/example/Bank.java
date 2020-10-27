package com.training.example;

import javax.naming.LimitExceededException;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	
	public double withdraw(double amount) throws ExceedingException {
		if(amount>4000)
			throw new ExceedingException("amount beyond limit");
	
	if(amount<=0) {
		throw new NegValueException("amount is less than 0");
	}
		return balance=balance-amount;
	}
	
	
	
	public double deposit(double amount)
	{
		if(amount>49000)
			throw new ExceedingException("amount more than limit");
	
	if(amount<=0) {
		throw new NegValueException("amount is less than 0");
	}
		return balance=balance+amount;
	}
	
}
