package io.github.alicankustemur.musicstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.alicankustemur.musicstore.model.Customer;
import io.github.alicankustemur.musicstore.service.AlbumService;
import io.github.alicankustemur.musicstore.service.CustomerService;

@Controller
@RequestMapping("/sellAlbum")
public class SellAlbumController
{

	@Autowired
	AlbumService	albumService;

	@Autowired
	CustomerService	customerService;

	@RequestMapping
	public String getSellAlbumForm(Model model)
	{
		model.addAttribute("albums", albumService.getAllAlbum());

		return "sellAlbumForm";
	}

	@RequestMapping(value = "sellAlbum", method = RequestMethod.POST)
	public String sellAlbum(@ModelAttribute Customer customer)
	{
		System.out.println(customer.toString());

		customerService.saveCustomer(customer);
		return "redirect:/";
	}

}
