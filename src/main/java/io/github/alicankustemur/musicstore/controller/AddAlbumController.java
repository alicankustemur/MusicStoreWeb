package io.github.alicankustemur.musicstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.alicankustemur.musicstore.domain.Album;
import io.github.alicankustemur.musicstore.service.AlbumService;

@Controller
@RequestMapping("/addAlbum")
public class AddAlbumController
{

	private static String	ADD_ALBUM_FORM	= "addAlbumForm";
	private static String	DONE_VIEW		= "done";
	private static String	ADD_ALBUM_VIEW	= "addAlbum";

	@Autowired
	private AlbumService	albumService;

	@RequestMapping
	public String getAddAlbumForm(Model model)
	{

		model.addAttribute("title", "Albüm Ekleme Formu");
		return ADD_ALBUM_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute Album album)
	{
		albumService.saveAlbum(album);

		return DONE_VIEW;
	}

}
