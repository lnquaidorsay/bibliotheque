package com.biblio.fr.biblio.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.biblio.fr.biblio.entite.Customer;

public interface ICustomerService {
	public Customer saveCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public void deleteCustomer(Integer customerId);

	public boolean checkIfIdexists(Integer id);

	public Customer findCustomerByEmail(String email);

	public List<Customer> findCustomerByLastName(String lastName);

	public Customer findCustomerById(Integer customerId);

	public Page<Customer> getPaginatedCustomersList(int begin, int end);
}
