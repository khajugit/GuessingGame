package com.factset.game.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

import com.factset.game.beans.GuessNumberBean;
import com.factset.game.model.GuessNumber;

/**
 * Servlet implementation class GuessGameServlet
 */
public class GuessGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger log=Logger.getLogger(GuessGameServlet.class);
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuessGameServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * This controller  process the input from user and provide the response back.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	log.debug("Started process of Guessing");		
		GuessNumberBean guessBean=new GuessNumberBean();
		int userGuessedNumber=Integer.parseInt(request.getParameter("guess"));
		guessBean.setUserGuessedNumber(userGuessedNumber);
		int minNumber=Integer.parseInt(request.getParameter("minValue"));
		guessBean.setMinNumber(minNumber);
		int maxNumber=Integer.parseInt(request.getParameter("maxValue"));
		guessBean.setMaxNumber(maxNumber);
		int actualNumber=Integer.parseInt(request.getParameter("actualValue"));
		guessBean.setActualNumber(actualNumber);
		int numberOfGuesses=Integer.parseInt(request.getParameter("numberOfGuesses"));
		guessBean.setNumberOfGuesses(numberOfGuesses);
		
		log.debug("Input request values:\n" +"userGuessedNumber: "+userGuessedNumber+"\n"+"actualNumber: "+actualNumber+"\n"+"numberOfGuesses: "+numberOfGuesses+"\n");
		GuessNumber guessNumber=new GuessNumber();
		boolean guessResults=guessNumber.getGuessResults(guessBean);
		if(guessResults){
			if(guessBean.getNumberOfGuesses()==3){
				request.setAttribute("GuessBean", guessBean);
				RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/gameWin.jsp");
				dispatcher.forward(request, response);
				
			}
			else if(guessBean.getNumberOfGuesses()<3)
			{
				request.setAttribute("GuessBean", guessBean);
				RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/gameWin.jsp");
				dispatcher.forward(request, response);
			
			}
		}else{
			if(guessBean.getNumberOfGuesses()>=3){
			request.setAttribute("GuessBean", guessBean);
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/gameLoss.jsp");
			dispatcher.forward(request, response);
		}
			else{
					request.setAttribute("GuessBean", guessBean);
					RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/playGame.jsp");
					dispatcher.forward(request, response);	
			}
		
		
	}
	

}
}