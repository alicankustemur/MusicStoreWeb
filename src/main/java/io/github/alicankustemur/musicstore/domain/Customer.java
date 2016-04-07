package io.github.alicankustemur.musicstore.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Customer implements Serializable
{

	@Id
	@GeneratedValue
	private long	id;

	@NotBlank
	@Length(min = 1, max = 10)
	private String	name;

	@NotBlank
	private String	surname;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public Customer createTestCustomer()
	{
		Customer customer = new Customer();
		customer.setName("customerName" + Math.random());
		customer.setSurname("customerSurname" + Math.random());
		return customer;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}

}
