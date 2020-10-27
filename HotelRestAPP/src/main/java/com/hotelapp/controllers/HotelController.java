package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;



@RestController
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@GetMapping("/hotels")
	public List<Hotel> showAllHotels(){
		return hotelService.getAllHotels();
	}
	
	@GetMapping("/hotel-by-city/{city}")
	public List<Hotel> showHotelsByCity(@PathVariable("city")String city){
		return hotelService.getByCity(city);
	}

	@GetMapping("/hotel-by-cusine/{cusine}")
	public List<Hotel> showHotelsByCusine(@PathVariable("cusine")String cusine){
		return hotelService.getByCusine(cusine);
	}
	
	@GetMapping("/hotel-by-id/{hotelId}")
	public Hotel showById(@PathVariable("hotelId")int id) {
		return hotelService.getById(id);
	}
}
