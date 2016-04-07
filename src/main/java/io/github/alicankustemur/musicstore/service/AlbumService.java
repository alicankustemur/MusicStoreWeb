package io.github.alicankustemur.musicstore.service;

import java.util.List;

import io.github.alicankustemur.musicstore.model.Album;

public interface AlbumService
{
	public Album sellAlbum(String name, String artistName, String variation, String genre, int songNumbers);

	public Album sellAlbum(Album album);

	public Album getAlbumByName(String name);

	public List<Album> getAllAlbum();
}
