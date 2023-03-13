package com.BankManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.BankManagementSystem.DTO.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	public Customer findByName(String username);
	
	@Query("select u from Customer u where u.custId= :n")
	public List<Customer> getCustomer(@Param("n") int name);

	
	
	

}
