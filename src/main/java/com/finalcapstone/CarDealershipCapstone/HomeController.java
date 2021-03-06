package com.finalcapstone.CarDealershipCapstone;

//Car Dealership Capstone
//By: Alli Farr, Ben McBrayer, Jonah Wooten, Vicki Rush
//6-13-18


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalcapstone.CarDealershipCapstone.repo.CarRepository;



@Controller
public class HomeController {

	@Autowired
	CarRepository cR;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("results")
	public String results() {
		return "results";
	}
}	

