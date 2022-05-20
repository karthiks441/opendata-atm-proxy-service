package com.llyodsbank.opendata_atm.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {

	@JsonProperty("Brand")
	public ArrayList<Brand> brand;

	public ArrayList<Brand> getBrand() {
		return brand;
	}

	public void setBrand(ArrayList<Brand> brand) {
		this.brand = brand;
	}
}
