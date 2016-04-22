package io.github.alicankustemur.musicstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.github.alicankustemur.musicstore.domain.Customer;

@Repository
public class JpaCustomerRepositoryImpl implements CustomerRepository
{

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Customer customer)
	{
		em.persist(customer);
	}

	@Override
	public Customer getCustomerByName(String name)
	{
		Customer customer = null;
		try
		{
			customer = (Customer)em.createQuery("FROM Customer c WHERE c.name = :name").setParameter("name", name)
					.getSingleResult();
		}
		catch (NoResultException e)
		{
			return null;
		}

		return customer;
	}

}
