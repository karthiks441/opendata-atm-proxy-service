package com.llyodsbank.opendata_atm.service;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.llyodsbank.opendata_atm.dto.ATM;
import com.llyodsbank.opendata_atm.dto.CompleteATMResponse;


@Service
public class ATMService {
	private static final Logger logger = LoggerFactory.getLogger(ATMService.class);
	
	private RestTemplate restTemplate;

	@Autowired
	public ATMService(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	public ATM getATMDetailsFromOpenBankAPI(String openBankingURL, String identificationCode) {
		logger.info("Searching for " + identificationCode + " using Open Banking Service URL -> " + openBankingURL);
		CompleteATMResponse completeATMResponse = restTemplate.getForObject(openBankingURL, CompleteATMResponse.class);
		if (completeATMResponse != null && !completeATMResponse.data.isEmpty() && !completeATMResponse.data.get(0).brand.isEmpty()
				&& !completeATMResponse.data.get(0).brand.get(0).atm.isEmpty()) {
			return completeATMResponse.getData().get(0).getBrand().get(0).getAtm().stream()
					.filter((atmTemp) -> StringUtils.equalsIgnoreCase(identificationCode, atmTemp.getIdentification())).findFirst()
					.orElse(null);
		}
		return null;
	}
}
