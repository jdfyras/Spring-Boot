package com.firas.laptops.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.firas.laptops.entities.Laptop;
import com.firas.laptops.service.LaptopService;

@Controller
public class LaptopController {
	@Autowired
	LaptopService laptopService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createLaptop";
	}
	
	@RequestMapping("/saveLaptop")
	public String saveLaptop(@ModelAttribute("laptop") Laptop laptop,
											@RequestParam("date") String date,
											ModelMap modelMap) throws
	ParseException
	{
		//conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		laptop.setDateCreation(dateCreation);

		Laptop saveLaptop = laptopService.saveLaptop(laptop);
		String msg ="laptop enregistré avec Id "+saveLaptop.getIdLaptop();
		modelMap.addAttribute("msg", msg);
		return "createLaptop";
	}
	@RequestMapping("/ListeLaptops")
	public String listeLaptop(ModelMap modelMap)
	{
		List<Laptop> laps = laptopService.getAllLaptops();
		modelMap.addAttribute("Laptops", laps);
		return "listeLaptops";
	}
	@RequestMapping("/supprimerLaptop")
	public String supprimerLaptop(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
	laptopService.deleteLaptopById(id);
	List<Laptop> laps = laptopService.getAllLaptops();
	modelMap.addAttribute("laptops", laps);
	return "listeLaptops";
	}
	@RequestMapping("/modifierLaptop")
	public String editerLaptop(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Laptop l= laptopService.getLaptop(id);
	modelMap.addAttribute("laptop", l);
	return "editerLaptop";
	}
	@RequestMapping("/updateLaptop")
	public String updateLaptop(@ModelAttribute("laptop") Laptop laptop,
	@RequestParam("date") String date,
	 ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));
	 laptop.setDateCreation(dateCreation);

	 laptopService.updateLaptop(laptop);
	 List<Laptop> laps = laptopService.getAllLaptops();
	 modelMap.addAttribute("laptops", laps);
	return "listeLaptops";
	}

	}