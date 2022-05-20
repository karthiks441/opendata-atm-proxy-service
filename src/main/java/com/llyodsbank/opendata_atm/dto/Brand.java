package com.llyodsbank.opendata_atm.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {

	@JsonProperty("BrandName")
	public String brandName;

	@JsonProperty("ATM")
	public ArrayList<ATM> atm;

	public ArrayList<ATM> getAtm() {
		return atm;
	}

	public void setAtm(ArrayList<ATM> atm) {
		this.atm = atm;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
}
