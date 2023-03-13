package com.BankManagementSystem.ServiceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankManagementSystem.DTO.Customer;
import com.BankManagementSystem.Repository.CustomerRepository;
import com.BankManagementSystem.Service.CustomerService;

@Service
public class CustomerServiceImplement  implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return this.customerRepository.save(cust);
	}

//	@Override
//	public List<Customer> getSingleCustomer(String name) {
//		// TODO Auto-generated method stub
//		System.out.println(name);
//
//		return this.customerRepository.getCustomer(name);
//		
//		
//	}

	@Override
	public List<Customer> getAllCustomer() {
		return this.customerRepository.findAll();
		
	}

	@Override
	public List<Customer> getSingleCustomerByid(int custid) {
		// TODO Auto-generated method stub
		return this.customerRepository.getCustomer(custid);
	}

}
