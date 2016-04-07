package io.github.alicankustemur.musicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addAlbum")
public class AddAlbumController
{

	@RequestMapping
	public String view(Model model)
	{

		model.addAttribute("title", "Albüm Ekleme Formu");
		return "addAlbumForm";
	}

}
