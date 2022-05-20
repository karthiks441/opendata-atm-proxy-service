package com.llyodsbank.opendata_atm.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {

	@JsonProperty("LastUpdated")
	public Date lastUpdated;
	
	@JsonProperty("TotalResults")
	public int totalResults;
	
	@JsonProperty("Agreement")
	public String agreement;
	
	@JsonProperty("License")
	public String license;
	
	@JsonProperty("TermsOfUse")
	public String termsOfUse;
}
