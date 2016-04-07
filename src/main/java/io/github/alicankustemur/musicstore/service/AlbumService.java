package io.github.alicankustemur.musicstore.service;

import java.util.List;

import io.github.alicankustemur.musicstore.domain.Album;

public interface AlbumService
{
	public Album saveAlbum(String name, String artistName, String variation, String genre, int songNumbers);

	public Album saveAlbum(Album album);

	public Album getAlbumByName(String name);

	public List<Album> getAllAlbum();
}
