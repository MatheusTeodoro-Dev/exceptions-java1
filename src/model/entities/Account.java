package model.entities;

import model.exceptions.SaqueException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account () {
		
	}

	public Account(Integer number, String holder, Double amount, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = amount;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withDraw(Double amount) throws SaqueException {
		if(amount > withDrawLimit ) {
			throw new SaqueException("The amount exceds withdraw limit");
		} else if (amount > balance) {
			throw new SaqueException("The amount exceds balance in account");
		} else {
			balance -= amount;
		}
	}
	
	@Override
	public String toString () {
		return "Number: " + number + ", holder: " + holder + ", balance: " + balance;
	}
}
