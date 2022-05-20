package com.llyodsbank.opendata_atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This Microservice is used to retrieve the matching atm details from the open banking services atms list. 
 * 
 * @author Karthik
 *
 */
@SpringBootApplication
public class OpenDataATMProxyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenDataATMProxyServiceApplication.class, args);
	}

}
