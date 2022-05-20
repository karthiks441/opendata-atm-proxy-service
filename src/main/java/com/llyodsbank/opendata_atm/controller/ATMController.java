package com.llyodsbank.opendata_atm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.llyodsbank.opendata_atm.dto.ATM;
import com.llyodsbank.opendata_atm.service.ATMService;

/**
 * @author Karthik
 *
 */
@RestController
@RequestMapping("/openbanking")
public class ATMController {

	Logger logger = LoggerFactory.getLogger(ATMController.class);

	@Autowired
	ATMService atmService;

	@GetMapping(value = "/atm", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAtmDetails(@RequestParam(required = true) String openBankingURL,
			@RequestParam(required = true) String identificationCode) {
		logger.info("Searching for " + identificationCode + " using Open Banking Service URL -> " + openBankingURL);
		ATM response;
		try {
			response = atmService.getATMDetailsFromOpenBankAPI(openBankingURL, identificationCode);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
		return response!=null ? ResponseEntity.ok().body(response)
				: ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
}
