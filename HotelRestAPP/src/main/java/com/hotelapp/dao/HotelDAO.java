package com.hotelapp.dao;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelDAO {
	List<Hotel> getAllHotels();
	List<Hotel> getByCiyt(String author);
	List<Hotel> getByCusine(String category);
	Hotel getById(int id);

}
