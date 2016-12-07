var currentMonthName;

document.onload = function(e){

	currentMonthName = document.getElementById("months").options[document.getElementById("months").selectedIndex];


	document.getElementById(currentMonthName).setAttribute("class", "month visible");

	console.log("huhu");
}