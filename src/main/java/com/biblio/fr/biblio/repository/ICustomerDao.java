package com.biblio.fr.biblio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblio.fr.biblio.entite.Customer;

@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer> {
	public Customer findCustomerByEmailIgnoreCase(String email);

	public List<Customer> findCustomerByLastNameIgnoreCase(String lastName);
}
