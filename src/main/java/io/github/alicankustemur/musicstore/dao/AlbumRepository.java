package io.github.alicankustemur.musicstore.dao;

import java.util.List;

import io.github.alicankustemur.musicstore.domain.Album;

public interface AlbumRepository
{
	public void save(Album album);

	public void deleteByName(String name);

	public List<Album> getAllAlbumByArtistName(String artistName);

	public Album getAlbumByName(String name);

	public List<Album> getAllAlbum();

}
