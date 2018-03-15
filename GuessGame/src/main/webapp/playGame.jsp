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
<script type="text/javascript">  
		function validateform()
		{  
			
			var guessValue = document.getElementById("guess").value;
			if (guessValue==null || guessValue=="")
			{  
			  alert("Guess should not be empty");
			  return false;  
			}
			else if(guessValue>10 || guessValue<1)
			{
			  alert("Please guess from 1 to 10");  
			  return false; 
			}
			else if(isNaN(guessValue))
			{
			  alert("Guess value should be number from 1 to 10");  
			  return false; 
			}
			else if(isNaN(guessValue))
			{
			  alert("Guess value should be number from 1 to 10");  
			  return false; 
			}
			return true;
		}
</script>
<title>Guessing Number Game</title>
</head>
<body>
<div class="gamestyle1" >
<div class="gamestyle2">
<div class="heading-cls">Welcome to Guessing Number Game</div>
<div class="gamestyle3">
I am thinking a number from <%=guessBean.getMinNumber()%> to <%=guessBean.getMaxNumber()%>.<br> 
You must guess what it is in three tries.<br></div>
<div class="gamestyle4">
<form name="guessingForm " action="guessGame" method="post">
Enter a guess: <input type="text" id="guess" name="guess"> 
<input type="submit" name="Botton" value="Guess it" onclick="return validateform();" /><br> 
Your <%=guessBean.getNumberOfGuesses()%> guess is: <%=guessBean.getUserGuessedNumber()%> (<%=guessBean.getSuccessMessage()%>)<br>
<input type="hidden" name="minValue" value=<%=guessBean.getMinNumber()%>>
<input type="hidden" name="maxValue" value=<%=guessBean.getMaxNumber()%>> 
<input type="hidden" name="actualValue" value=<%=guessBean.getActualNumber()%>> 
<input type="hidden" name="numberOfGuesses" value=<%=guessBean.getNumberOfGuesses()%>>
</form>
</div>
</div>
</div>

</body>


</body>
</html>