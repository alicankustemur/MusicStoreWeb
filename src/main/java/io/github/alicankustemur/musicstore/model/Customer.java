package io.github.alicankustemur.musicstore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable
{

	@Id
	@GeneratedValue
	private long	id;

	private String	name;
	private String	surname;

	@Id
	@Column(name = "album_id")
	private long	albumId;

	public long getAlbumId()
	{
		return albumId;
	}

	public void setAlbumId(long albumId)
	{
		this.albumId = albumId;
	}

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
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", albumId=" + albumId + "]";
	}

}
