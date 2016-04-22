package io.github.alicankustemur.musicstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;

@Entity
public class Sell
{
	@Id
	@GeneratedValue
	private long		id;

	@Valid
	@OneToOne
	private Album		album;

	@Valid
	@OneToOne
	private Customer	customer;

	private boolean		sold;

}
