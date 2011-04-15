<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit your profile</title>
</head>
<h1>Update your profile...</h1>
<body>
	<form action="/editProfileServlet" method="post">
		Age:<input type="int" value="--None--" name="age"><br /> 
		Birthday:<select name="mydropdown">
			<option value="month" selected="selected">Month</option>
			<option value="january">January</option>
			<option value="february">February</option>
			<option value="march">March</option>
			<option value="april">April</option>
			<option value="may">May</option>
			<option value="june">June</option>
			<option value="july">July</option>
			<option value="august">August</option>
			<option value="september">September</option>
			<option value="october">October</option>
			<option value="november">November</option>
			<option value="december">December</option>

		</select> <select name="mydropdown">
			<option value="day" selected="selected">Day</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option>
			<option value="22">22</option>
			<option value="23">23</option>
			<option value="24">24</option>
			<option value="25">25</option>
			<option value="26">26</option>
			<option value="27">27</option>
			<option value="28">28</option>
			<option value="29">29</option>
			<option value="30">30</option>
			<option value="31">31</option>

		</select> <select name="mydropdown">
			<option value="year" selected="selected">Year</option>
			<option value="1985">1985</option>
			<option value="1986">1986</option>
			<option value="1987">1987</option>
			<option value="1988">1988</option>
			<option value="1989">1989</option>
			<option value="1990">1990</option>
			<option value="1991">1991</option>
			<option value="1992">1992</option>
			<option value="1993">1993</option>
		</select><br /> 
		School: <select name="mydropdown">
		<option value="none" selected="selected">--None--</option>
			<option value="cmc">Claremont McKenna</option>
			<option value="hmc">Harvey Mudd</option>
			<option value="pitz">Pitzer</option>
			<option value="pomo">Pomona</option>
			<option value="scripps">Scripps</option>
		</select><br />
		Sex:<input type="text" value="--None--" name="sex"><br /> 
		Seeking:<input type="text" value="--None--" name="seeking"><br /> 
		Description:<textarea>I am...</textarea><br />
		Activities:<textarea>I like...</textarea><br />
		<input type="submit" value="Save Changes" />
</body>
</html>