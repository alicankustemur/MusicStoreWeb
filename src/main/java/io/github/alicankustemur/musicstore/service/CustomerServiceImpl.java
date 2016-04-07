package io.github.alicankustemur.musicstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.alicankustemur.musicstore.dao.JpaCustomerRepositoryImpl;
import io.github.alicankustemur.musicstore.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private JpaCustomerRepositoryImpl customerRepository;

	public JpaCustomerRepositoryImpl getCustomerRepository()
	{
		return customerRepository;
	}

	public void setCustomerRepository(JpaCustomerRepositoryImpl customerRepository)
	{
		this.customerRepository = customerRepository;
	}

	@Transactional
	@Override
	public Customer getCustomerByName(String name)
	{
		return customerRepository.getCustomerByName(name);
	}

	@Transactional
	@Override
	public void saveCustomer(Customer customer)
	{
		Customer dbCustomer = customerRepository.getCustomerByName(customer.getName());

		if (dbCustomer == null)
		{
			customerRepository.save(customer);
			System.out.println(customer.getName() + " customer saved.");
		}
		else
		{
			System.out.println(dbCustomer.getName() + " is already exists in database.");
		}

	}

}
