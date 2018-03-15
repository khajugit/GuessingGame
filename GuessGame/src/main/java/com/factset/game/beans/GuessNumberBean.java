package com.factset.game.beans;

public class GuessNumberBean {
	private int minNumber;
	private int maxNumber;
	private int actualNumber;
	private int numberOfGuesses;
	private int userGuessedNumber;
	private String successMessage;
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public int getMinNumber() {
		return minNumber;
	}
	public void setMinNumber(int minNumber) {
		this.minNumber = minNumber;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public int getActualNumber() {
		return actualNumber;
	}
	public void setActualNumber(int actualNumber) {
		this.actualNumber = actualNumber;
	}
	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}
	public void setNumberOfGuesses(int numberOfGuesses) {
		this.numberOfGuesses = numberOfGuesses;
	}
	public int getUserGuessedNumber() {
		return userGuessedNumber;
	}
	public void setUserGuessedNumber(int userGuessedNumber) {
		this.userGuessedNumber = userGuessedNumber;
	}

	
	

}
