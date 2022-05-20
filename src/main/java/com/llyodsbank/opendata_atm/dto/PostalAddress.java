package com.llyodsbank.opendata_atm.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalAddress {

	@JsonProperty("AddressLine")
	public ArrayList<String> addressLine;
	
	@JsonProperty("StreetName")
	public String streetName;
	
	@JsonProperty("TownName")
	public String townName;
	
	@JsonProperty("CountrySubDivision")
	public ArrayList<String> countrySubDivision;
	
	@JsonProperty("Country")
	public String country;
	
	@JsonProperty("PostCode")
	public String postCode;
}
