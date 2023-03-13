package com.BankManagementSystem.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Account {
	
	//@Id
	private String accNumber;
	private float Balance;
	private String accountType;
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [ accNumber=" + accNumber + ", Balance=" + Balance + ", accountType="
				+ accountType + "]";
	}
	
	
	
	
	
	

}
