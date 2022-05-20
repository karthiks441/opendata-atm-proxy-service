package com.llyodsbank.opendata_atm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	
	@JsonProperty("PostalAddress")
	public PostalAddress postalAddress;
	
}
