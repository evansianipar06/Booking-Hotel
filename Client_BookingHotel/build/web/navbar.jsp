<%-- 
    Document   : header
    Created on : Mar 4, 2021, 10:11:46 AM
    Author     : Win_10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Hotel</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link href="css/bootstrap.css" rel="stylesheet"/>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
              <a class="navbar-brand" href="dashboard.jsp">Booking Hotel PASTI</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="dashboard.jsp">Home</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="tambah.jsp">Booking</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="home.jsp">Daftar Booking</a>
                  </li>
                  <li class="nav-item">
                        <a class="nav-link" href="profil.jsp">Kelompok</a>
                    </li>
                  </li>
                  <li class="d-flex">
                        
                  </li>
                  </li>
                </ul>
                  <form class="d-flex">
                       <a class="nav-link" href="logout.jsp">Logout</a>
                </form>
              </div>
            </div>
        </nav>
    </body>
</html>
