package io.github.alicankustemur.musicstore.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Album implements Serializable
{

	@Id
	@GeneratedValue
	private long	id;

	private String	name;

	@Column(name = "artist_name")
	private String	artistName;

	private String	variation;

	private String	genre;

	@Column(name = "song_numbers")
	private int		songNumbers;

	@Transient
	private boolean	solded;

	public boolean isSolded()
	{
		return solded;
	}

	public void setSolded(boolean solded)
	{
		this.solded = solded;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getVariation()
	{
		return variation;
	}

	public void setVariation(String variation)
	{
		this.variation = variation;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getArtistName()
	{
		return artistName;
	}

	public void setArtistName(String artistName)
	{
		this.artistName = artistName;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public int getSongNumbers()
	{
		return songNumbers;
	}

	public void setSongNumbers(int songNumbers)
	{
		this.songNumbers = songNumbers;
	}

	public Album createTestAlbum()
	{
		Album album = new Album();
		album.setName("name" + Math.random());
		album.setArtistName("artist_name" + Math.random());
		album.setGenre("genre" + Math.random());
		album.setSongNumbers((int)Math.random());
		album.setVariation("variation" + Math.random());

		return album;
	}

	@Override
	public String toString()
	{
		return "Album [id=" + id + ", variation=" + variation + ", name=" + name + ", artistName=" + artistName
				+ ", genre=" + genre + ", songNumbers=" + songNumbers + ", solded=" + solded + "]";
	}

}
