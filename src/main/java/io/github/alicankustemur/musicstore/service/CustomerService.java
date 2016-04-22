package io.github.alicankustemur.musicstore.service;

import io.github.alicankustemur.musicstore.domain.Customer;

public interface CustomerService
{
	public void saveCustomer(Customer customer);

	public Customer getCustomerByName(String name);
}
