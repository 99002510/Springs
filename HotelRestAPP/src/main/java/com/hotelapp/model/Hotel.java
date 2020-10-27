package com.hotelapp.model;

public class Hotel {
	
	Integer Id;
	String name;
	String city;
	String cusine;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Integer id, String name, String city, String cusine) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.cusine = cusine;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	@Override
	public String toString() {
		return "Hotel [Id=" + Id + ", name=" + name + ", city=" + city + ", cusine=" + cusine + "]";
	
	}

}
