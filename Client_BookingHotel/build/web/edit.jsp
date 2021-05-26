<%-- 
    Document   : edit-booking
    Created on : Mar 4, 2021, 11:30:02 AM
    Author     : Win_10
--%>

<%@include file="navbar.jsp" %>
<div class="container">
<h3>Form Edit Booking Hotel PASTI</h3>
<hr>
<form class="form-horizontal" method="post" action="proses-edit.jsp">
    <%
    try {
    WebServiceClient.KamarHotel service = new WebServiceClient.KamarHotel();
    WebServiceClient.KamarHotelService port = service.getKamarHotelServicePort();

    int kode = Integer.valueOf(request.getParameter("kode"));
    java.util.List<java.lang.Object> result = port.getKamarHotel(kode);
    for (int i = 0; i < result.size(); i++) {
        out.println(result.get(i)); 
    }
    } catch (Exception ex) {
        System.out.println("Gagal!");
    }
    %>
    <hr>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Edit</button>
    </div> 
</form>
</div>
