package com.BankManagementSystem.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	
	@Id
	private int custId;
	
	private String name;
	private int mobilenumber;
	private String mailId;
	private String Address;
	
//	@OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "accid_fkey", referencedColumnName = "custId")
//	private List<Account> accNumber;
//	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
//	public List<Account> getAccNumber() {
//		return accNumber;
//	}
//	public void setAccNumber(List<Account> accNumber) {
//		this.accNumber = accNumber;
//	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobilenumber=" + mobilenumber + ", mailId=" + mailId
				+ ", Address=" + Address + "]";
	}

	 
	
	

}
