package io.github.alicankustemur.musicstore.service;

import io.github.alicankustemur.musicstore.model.Album;
import io.github.alicankustemur.musicstore.model.Customer;

public interface CustomerService
{
	public void saveCustomer(String name, String surname, Album album);

	public void saveCustomer(Customer customer);

	public Customer getCustomerByName(String name);
}
