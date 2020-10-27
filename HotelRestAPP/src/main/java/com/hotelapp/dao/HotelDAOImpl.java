package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import com.hotelapp.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO
{

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCiyt(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newhotellist=new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getCity().equals(city))
				newhotellist.add(hotel);
		}
		return newhotellist;
		
	}

	@Override
	public List<Hotel> getByCusine(String cusine) {
		// TODO Auto-generated method stub
		List<Hotel> newhotellist=new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getCusine().equals(cusine))
				newhotellist.add(hotel);
		}
		return newhotellist;
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		for( Hotel hotel:showHotelList()) {
			if(hotel.getId()==id)
				return hotel;
		}
		return null;
		
	}

	private List<Hotel> showHotelList(){
        return Arrays.asList(
                new Hotel(1,"Lemon three","Mysuru","Indian"),
                new Hotel(2,"Empire","Mysuru","Indian"),
                new Hotel(3,"RRR","Mysuru","Indian"),
                new Hotel(4,"Apoorva","Mysuru","Indian"));
                }

}
