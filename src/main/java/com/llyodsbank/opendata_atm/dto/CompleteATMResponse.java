package com.llyodsbank.opendata_atm.dto;

import java.util.ArrayList;

public class CompleteATMResponse {
	
	public Meta meta;
	public ArrayList<Datum> data;
	
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public ArrayList<Datum> getData() {
		return data;
	}
	public void setData(ArrayList<Datum> data) {
		this.data = data;
	}
}
