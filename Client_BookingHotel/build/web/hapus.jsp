<%-- 
    Document   : hapus
    Created on : Mar 4, 2021, 11:26:58 AM
    Author     : Win_10
--%>

<%-- start web service invocation --%><hr/>
    <%
    try {
        WebServiceClient.KamarHotel service = new WebServiceClient.KamarHotel();
        WebServiceClient.KamarHotelService port= service.getKamarHotelServicePort();

	 // TODO initialize WS operation arguments here
	int kode = Integer.valueOf(request.getParameter("kode")); port.delBooking(kode);
        response.sendRedirect("home.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
<%-- end web service invocation --%><hr/>
