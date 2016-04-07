package io.github.alicankustemur.musicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{

	@RequestMapping("/")
	public String view(Model model)
	{
		model.addAttribute("title", "Müzik Dükkanı");
		return "index";
	}

}
