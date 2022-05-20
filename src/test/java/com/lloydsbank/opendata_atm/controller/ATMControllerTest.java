package com.lloydsbank.opendata_atm.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.llyodsbank.opendata_atm.controller.ATMController;
import com.llyodsbank.opendata_atm.service.ATMService;

@WebMvcTest(ATMController.class)
public class ATMControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ATMService atmService;

	@Test
	public void getATMDetailsShouldReturnIdFromService() throws Exception {
		String identificationCode = "LFFFBC11";
		String openBankingURL = "https://api.lloydsbank.com/open-banking/v2.2/atms";
		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("LFFFBC11")));
	}

}
