package com.factset.game.utilities;
import com.factset.game.beans.GuessNumberBean;

public class WebUtils {
	public static int getRandomNumber(int minNumber,int MaxNumber){
		
		//random() methods return the value from 0.0 to 0.9
		int randomNumber=(int )(Math.random() * 10 + 1);
		
		return randomNumber;
		
	}
	
	public static boolean checkColdCondition(int userGuessedNumber,int actualNumber){
		boolean isCold=false;
		
		if(userGuessedNumber>=(actualNumber+3)||(userGuessedNumber<=(actualNumber-3))){
			
			isCold=true;
			
		}
		
		return isCold;
		
	}
	public static boolean checkWarmCondition(int userGuessedNumber,int actualNumber){
		
boolean isWarm=false;
		
		if(userGuessedNumber==(actualNumber+2)||(userGuessedNumber==(actualNumber-2))){
			
			isWarm=true;
			
		}
		
		return isWarm;
		
	}
	public static boolean checkHotCondition(int userGuessedNumber,int actualNumber){
		
boolean isHot=false;
		
		if(userGuessedNumber==(actualNumber+1)||(userGuessedNumber==(actualNumber-1))){
			
			isHot=true;
			
		}
		
		return isHot;
		
	}

	public static void incrementGuesses(GuessNumberBean guessBean) {
		int numberOfGuesses=guessBean.getNumberOfGuesses()+1;
		guessBean.setNumberOfGuesses(numberOfGuesses);
		
	}

}
