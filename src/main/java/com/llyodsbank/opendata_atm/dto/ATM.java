package com.llyodsbank.opendata_atm.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATM {

	@JsonProperty("Identification")
	public String identification;

	@JsonProperty("SupportedCurrencies")
	public ArrayList<String> supportedCurrencies;

	@JsonProperty("Location")
	public Location location;

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public ArrayList<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}

	public void setSupportedCurrencies(ArrayList<String> supportedCurrencies) {
		this.supportedCurrencies = supportedCurrencies;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
