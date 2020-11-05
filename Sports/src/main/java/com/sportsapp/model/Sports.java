package com.sportsapp.model;

public class Sports {
	Integer sportsId;
	String stadiumName;
	String specialityGame;
	
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sports(Integer sportsId, String stadiumName, String specialityGame) {
		super();
		this.sportsId = sportsId;
		this.stadiumName = stadiumName;
		this.specialityGame = specialityGame;
	}

	public Integer getSportsId() {
		return sportsId;
	}
	public void setSportsId(Integer sportsId) {
		this.sportsId = sportsId;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public String getSpecialityGame() {
		return specialityGame;
	}
	public void setSpecialityGame(String specialityGame) {
		this.specialityGame = specialityGame;
	}

	@Override
	public String toString() {
		return "Sports [sportsId=" + sportsId + ", stadiumName=" + stadiumName + ", specialityGame=" + specialityGame
				+ "]";
	}
	
	

}
