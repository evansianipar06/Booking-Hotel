<%-- 
    Document   : index
    Created on : Mar 4, 2021, 10:20:22 AM
    Author     : Win_10
--%>

<%@include file="navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>Booking Hotel</title>
	<link rel="stylesheet" type="text/css" href="./css/bootstrap.css">
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/bootstrap.js"></script>	
<link rel="dns-prefetch" href="//fonts.googleapis.com" />
<link rel="dns-prefetch" href="//fonts.gstatic.com" />
<link rel="preload" as="style" href="https://fonts.googleapis.com/css?family=Open Sans:400,500,600,700&display=swap" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open Sans:400,500,600,700&display=swap" media="print" onload="this.media='all'">
</head>
<body data-rsssl=1>

   <div class="container">		
	<center><h1>Booking Hotel PASTI</h1></center>
	<br/>
	<div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
        <%
	if(session.getAttribute("login")==null || session.getAttribute("login")==" ") //check condition unauthorize user not direct access welcome.jsp page
	{
		response.sendRedirect("dashboard.jsp"); 
	}
	%>
	
	<h1> Selamat Datang ! </h1>

	
  <div class="carousel-inner">
    <div class="carousel-item active" data-bs-interval="10000">
        <img src="./img/6.jpg" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
          <h5>Booking NOW</h5>
          <p>Cepat dan Tepat</p>
        </div>
    </div>
    <div class="carousel-item" data-bs-interval="2000">
      <img src="./img/2.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
            <h5>Booking NOW</h5>
            <p>Cepat dan Tepat</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="./img/3.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
            <h5>Booking NOW</h5>
            <p>Cepat dan Tepat</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark"  data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark"  data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
 <hr> 
 <hr>
 <center><h4> Jenis Room Hotel PASTI</h4></center>
 <br>
 
 <div class="row row-cols-1 row-cols-md-3 g-4">
  <div class="col">
    <div class="card">
      <img src="./img/hotel1.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Kamar SUITE</h5>
        <p class="card-text">Rp. 180.000</p>
        <a href="kamarSuite.jsp" class="btn btn-primary">Booking</a>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="./img/hotel2.jpeg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Kamar DELUXE</h5>
        <p class="card-text">Rp. 150.000</p>
        <a href="kamarDeluxe.jsp" class="btn btn-primary">Booking</a>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="./img/hotel3.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Kamar DELUXE ROOM ONLY</h5>
        <p class="card-text">Rp. 130.000</p>
        <a href="kamarDeluxeRoomOnly.jsp" class="btn btn-primary">Booking</a>
      </div>
    </div>
  </div>
</div>
        
   </div>
</body>
</html>
