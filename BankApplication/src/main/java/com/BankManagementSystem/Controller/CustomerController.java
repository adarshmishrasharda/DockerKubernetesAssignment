package com.BankManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankManagementSystem.DTO.Customer;
import com.BankManagementSystem.Service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/welcome")
	public String getMessage()
	{
		return "welcome to docker image";
	}
	
	@PostMapping("/")
	public Customer createUser(@RequestBody Customer user) throws Exception
	{
		return this.customerService.createCustomer(user);
	}
	
//	@GetMapping("/{name}")
//	public List<Customer> getCustomer(@PathVariable("name") String name)
//	{
//		//System.out.println(name);
//		
//		List<Customer> cust=this.customerService.getSingleCustomer(name);
//		System.out.println(cust);
//		
//		return cust;
//	}
	
	@GetMapping("/{custid}")
	public List<Customer> getCustomerById(@PathVariable("custid") int custid)
	{
	    System.out.println(custid);
		
		List<Customer> cust=this.customerService.getSingleCustomerByid(custid);
		System.out.println(cust);
		
		return cust;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAllData()
	{
		return this.customerService.getAllCustomer();
		//System.out.println(cust);
		
		//return cust;
	}

}
