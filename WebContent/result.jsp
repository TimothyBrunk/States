<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About the States</title>
<link rel="shortcut icon" href="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRtG180e-SMUADwylbYn3Cp1RGiMklmsjn68xzaA4ZExUowheTR" />
<h1> About the States</h1>
<script src="http://maps.googleapis.com/maps/api/js" align="center"></script>
    <!-- <script>
        function initialize() {
         var mapProp = {
       center:new google.maps.LatLng(${state.latitude},${state.longitude}), 
       zoom:5,
       mapTypeId:google.maps.MapTypeId.ROADMAP
         };
         var map=new 
         google.maps.Map(document.getElementById("googleMap"),mapProp);
        }
        google.maps.event.addDomListener(window, 'load', initialize);
    </script> -->
</head>

<body>
	<c:choose>
		<c:when test="${! empty state}">
			
				<p>State Name: ${state.name}</p>
				<p>State Abbreviation: ${state.abbreviation}</p>
				<p>State Capital: ${state.capital}</p>
				<p>Capital Population: ${state.population}</p>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<p class="trivia" > State Trivia:
				<br>
				<br>
				${state.trivia}</p>
				
				


				
			
			
			<div>
			<!-- <div id="googleMap" style="width: 550px; height: 380px;"> -->
			<img src="http://maps.googleapis.com/maps/api/staticmap?center=${state.latitude},${state.longitude}&zoom=11&size=200x200&sensor=false"> 
			</div>





		</c:when>
		<c:otherwise>
			<p>No state found</p>
		</c:otherwise>
	</c:choose>
<br>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p>-</p>
<p><h1>Easter Egg</h1></p>

</body>
</html>