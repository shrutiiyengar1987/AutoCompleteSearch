package com.javafans.practise.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javafans.practise.service.AutoCompleteService;

@RestController
public class AutoCompleteRestController  {
	
	Logger logger=LoggerFactory.getLogger(AutoCompleteRestController.class);

	@Autowired
	AutoCompleteService completeService;
	
	@GetMapping("/search")
	public ResponseEntity<String> doAutoComplete(@RequestParam("q") final String input){
		List<String> strings=completeService.doAutoComplete(input);
		ObjectMapper mapper=new ObjectMapper();
		String resp="";
		
			try {
				resp=mapper.writeValueAsString(strings);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				System.out.println("JsonProcessingException");
			}
		
	return new ResponseEntity<String>(resp,HttpStatus.OK);
	}

}
