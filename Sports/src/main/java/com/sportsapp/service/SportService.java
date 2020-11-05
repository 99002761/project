package com.sportsapp.service;

import java.util.List;


import com.sportsapp.exceptions.SportNotFoundException;
import com.sportsapp.model.Sports;

public interface SportService {
	List<Sports> getAllSports();

	List<Sports> getByStadiumName(String stadiumName) throws SportNotFoundException;
	List<Sports> getBySportGame(String specialityName) throws SportNotFoundException;
	Sports findSportById(Integer sportsId) throws SportNotFoundException;
	
	Sports add(Sports sport);
	Sports updateSports(Sports sport);
	boolean deleteSports (Integer sportsId) throws SportNotFoundException;
	


}
