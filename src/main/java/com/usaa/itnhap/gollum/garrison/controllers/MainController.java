package com.usaa.itnhap.gollum.garrison.controllers;

import com.usaa.itnhap.gollum.garrison.dao.FlightDao;
import com.usaa.itnhap.gollum.garrison.domain.Flight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

	FlightDao flightDao = new FlightDao();


	@RequestMapping("/")
	public String index() {
		return "CodeathonMenu";
	}

	@RequestMapping("my-trips")
	public String myTrips() {
		return "CodeathonMyTrips";
	}

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("book-trip")
	public String bookTrip(Model model) {
		List<Flight> flights = flightDao.getFlights();
		model.addAttribute("flights", flights);
		return "CodeathonBookTrip";
	}

}