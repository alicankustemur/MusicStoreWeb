package io.github.alicankustemur.musicstore.dao;

import io.github.alicankustemur.musicstore.model.Customer;

public interface CustomerRepository
{
	public void save(Customer customer);

	public Customer getCustomerByName(String name);

}
