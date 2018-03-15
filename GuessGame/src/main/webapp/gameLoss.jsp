<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.factset.game.beans.GuessNumberBean" %>
<%

GuessNumberBean guessBean=(GuessNumberBean)request.getAttribute("GuessBean");

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="game.css" rel="stylesheet" type="text/css"/>
<title>Guessing Number Game</title>
</head>
<body>

<script>
function myFunction(){
	alert("Please click on Play again link to start the game again!!");
	return false;
	
}
</script>

<div class="gamestyle1" >
<div class="gamestyle2">
<div class="heading-cls">Welcome to Guessing Number Game</div>
<div class="gamestyle3">
I am thinking a number from <%=guessBean.getMinNumber()%> to <%=guessBean.getMaxNumber()%>.<br> 
You must guess what it is in three tries.<br></div>
<div class="gamestyle4">
<form name="guessingForm " action="guessGame" method="post">
Enter a guess: <input type="text" name="guess"> 
<input type="submit" name="Botton" value="Guess it" onclick=" return myFunction()" /><br> 
Your <%=guessBean.getNumberOfGuesses()%> guess is: <%=guessBean.getUserGuessedNumber()%> <br>
Right! You have lost the game.
<a href="startGame.jsp">Play again!</a>
</form>
</div>
</div>
</div>
</body>


</body>
</html>