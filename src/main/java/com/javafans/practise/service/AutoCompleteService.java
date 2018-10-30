package com.javafans.practise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javafans.practise.dao.AutoCompleteDao;

@Service
public class AutoCompleteService {
	public List<String> doAutoComplete(final String input){
		return AutoCompleteDao.getRestaurantsList(input);
	}
}
