package com.BankManagementSystem.Service;

import java.util.List;

import com.BankManagementSystem.DTO.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer cust);
	
	
	//public List<Customer> getSingleCustomer(String name);
	
	public List<Customer> getSingleCustomerByid(int custid);
	
	public List<Customer> getAllCustomer();
	



}
