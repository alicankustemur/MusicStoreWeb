package io.github.alicankustemur.musicstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.alicankustemur.musicstore.dao.JpaAlbumRepositoryImpl;
import io.github.alicankustemur.musicstore.model.Album;

@Service
public class AlbumServiceImpl implements AlbumService
{
	@Autowired
	private JpaAlbumRepositoryImpl albumRepository;

	public JpaAlbumRepositoryImpl getAlbumRepository()
	{
		return albumRepository;
	}

	public void setAlbumRepository(JpaAlbumRepositoryImpl albumRepository)
	{
		this.albumRepository = albumRepository;
	}

	@Transactional
	@Override
	public Album sellAlbum(String name, String artistName, String variation, String genre, int songNumbers)
	{

		Album dbAlbum = getAlbumByName(name);
		Album album = new Album();

		if (dbAlbum == null)
		{
			album.setVariation(variation);
			album.setName(name);
			album.setArtistName(artistName);
			album.setGenre(genre);
			album.setSongNumbers(songNumbers);
			album.setSolded(true);
			albumRepository.save(album);

		}
		else
		{
			System.out.println(dbAlbum.getName() + " is already exists in database.");
		}

		return album;

	}

	@Transactional
	@Override
	public Album getAlbumByName(String name)
	{
		Album album = new Album();
		album = albumRepository.getAlbumByName(name);
		if (album != null)
		{
			System.out.println(album.getName() + " album returned.");
		}
		return album;
	}

	@Transactional
	@Override
	public Album sellAlbum(Album album)
	{

		Album dbAlbum = getAlbumByName(album.getName());
		if (dbAlbum == null)
		{
			album.setVariation(album.getVariation());
			album.setName(album.getName());
			album.setArtistName(album.getArtistName());
			album.setGenre(album.getGenre());
			album.setSongNumbers(album.getSongNumbers());
			album.setSolded(true);
			albumRepository.save(album);

		}
		else
		{
			System.out.println(dbAlbum.getName() + " is already exists in database.");
		}

		return album;
	}

	@Override
	public List<Album> getAllAlbum()
	{
		return albumRepository.getAllAlbum();
	}

}
