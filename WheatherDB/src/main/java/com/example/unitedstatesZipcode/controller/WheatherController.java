package com.example.unitedstatesZipcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WheatherController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getCountryDetail/{countrycode}")
	public ResponseEntity<String> getZipCodeDetails(@PathVariable String countrycode){
		return ResponseEntity.ok(restTemplate.getForObject("https://weatherdbi.herokuapp.com/data/weather/"+countrycode,String.class));
	}
}
