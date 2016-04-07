package io.github.alicankustemur.musicstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.alicankustemur.musicstore.domain.Customer;
import io.github.alicankustemur.musicstore.service.AlbumService;
import io.github.alicankustemur.musicstore.service.CustomerService;

@Controller
@RequestMapping("/sell")
public class SellController
{

	private static String	SELL_FORM	= "sellForm";
	private static String	DONE_VIEW	= "done";
	private static String	SELL_VIEW	= "sell";

	@Autowired
	AlbumService			albumService;

	@Autowired
	CustomerService			customerService;

	@RequestMapping
	public String getSellForm(Model model)
	{
		model.addAttribute("albums", albumService.getAllAlbum());
		return SELL_FORM;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute Customer customer)
	{
		System.out.println(customer.toString());

		customerService.saveCustomer(customer);
		return "redirect:/";
	}

}
