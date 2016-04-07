package io.github.alicankustemur.musicstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.github.alicankustemur.musicstore.model.Album;

@Repository
public class JpaAlbumRepositoryImpl implements AlbumRepository
{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Album album)
	{
		em.persist(album);
	}

	@Override
	public void deleteByName(String name)
	{
		// VTODO Auto-generated method stub

	}

	@Override
	public List<Album> getAllAlbumByArtistName(String artistName)
	{
		List<Album> result = em.createQuery("SELECT * FROM Album", Album.class).getResultList();
		return result;
	}

	@Override
	public Album getAlbumByName(String name)
	{
		Album album = null;
		try
		{
			album = (Album)em.createQuery("FROM Album a WHERE a.name = :name").setParameter("name", name)
					.getSingleResult();
		}
		catch (NoResultException e)
		{
			return null;
		}

		return album;
	}

	@Override
	public List<Album> getAllAlbum()
	{

		List<Album> result = em.createQuery("Select a from Album a", Album.class).getResultList();
		return result;
	}

}
