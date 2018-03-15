package com.factset.game.model;

import org.apache.log4j.Logger;

import com.factset.game.beans.GuessNumberBean;
import com.factset.game.utilities.WebUtils;

public class GuessNumber {
	Logger log=Logger.getLogger(GuessNumber.class);
public boolean getGuessResults(GuessNumberBean guessBean){
	log.debug("Processing in GuessNumber model class");
	boolean guessResult=false;
	
	
	if(guessBean.getActualNumber()==guessBean.getUserGuessedNumber()){
		WebUtils.incrementGuesses(guessBean);
		String message="Right! You have won the game";
		guessBean.setSuccessMessage(message);
		guessResult=true;
		return guessResult;
	}
	else{
		
		//Incrementing the guesses as the guessed value is not correct.
		WebUtils.incrementGuesses(guessBean);
		
		if(WebUtils.checkColdCondition(guessBean.getUserGuessedNumber(), guessBean.getActualNumber())){
			//guessBean.set
			guessBean.setSuccessMessage("cold");
			return guessResult ;
			
		}
		if(WebUtils.checkWarmCondition(guessBean.getUserGuessedNumber(), guessBean.getActualNumber())){
			guessBean.setSuccessMessage("warm");
			return guessResult ;
			
		}
		if(WebUtils.checkHotCondition(guessBean.getUserGuessedNumber(), guessBean.getActualNumber())){
			guessBean.setSuccessMessage("hot");
			return guessResult ;
			
		}
		
		
	}
	return guessResult;
	
}
}
