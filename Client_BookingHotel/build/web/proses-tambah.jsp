<%-- 
    Document   : proses-tambah-booking
    Created on : Mar 4, 2021, 11:15:14 AM
    Author     : Win_10
--%>

<%-- start web service invocation --%><hr/>
<%
try {
    WebServiceClient.KamarHotel service = new WebServiceClient.KamarHotel();
    WebServiceClient.KamarHotelService port = service.getKamarHotelServicePort();

     // TODO initialize WS operation arguments here
    int kode = Integer.valueOf(request.getParameter("kode"));
    java.lang.String jenisKamar = request.getParameter("jenisKamar");
    java.lang.String harga = request.getParameter("harga");
    java.lang.String namaCustomer = request.getParameter("namaCustomer");
    java.lang.String tglCheckIn = request.getParameter("tglCheckIn");
    java.lang.String tglCheckOut = request.getParameter("tglCheckOut");
    java.lang.String noHp = request.getParameter("noHp");
    java.lang.String status = request.getParameter("status");
    java.lang.String alamat = request.getParameter("alamat");
    
    port.addBooking(kode, jenisKamar, harga, namaCustomer, tglCheckIn, tglCheckOut, noHp, status, alamat);
    
    response.sendRedirect("home.jsp");
} catch (Exception ex) {
    System.out.println("Gagal!");
}
%>
<%-- end web service invocation --%><hr/>
