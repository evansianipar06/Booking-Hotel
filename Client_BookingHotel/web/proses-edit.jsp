<%-- 
    Document   : proses-edit-booking
    Created on : Mar 4, 2021, 12:08:55 PM
    Author     : Win_10
--%>

<%
try {
    WebServiceClient.KamarHotel service = new WebServiceClient.KamarHotel();
    WebServiceClient.KamarHotelService port = service.getKamarHotelServicePort();

    int kode = Integer.valueOf(request.getParameter("kode"));
    java.lang.String jenisKamar = request.getParameter("jenisKamar");
    java.lang.String harga = request.getParameter("harga");
    java.lang.String namaCustomer = request.getParameter("namaCustomer");
    java.lang.String tglCheckIn = request.getParameter("tglCheckIn");
    java.lang.String tglCheckOut = request.getParameter("tglCheckOut");
    java.lang.String noHp = request.getParameter("noHp");
    java.lang.String status = request.getParameter("status");
    java.lang.String alamat = request.getParameter("alamat");
    
    port.editBooking(kode, jenisKamar, harga, namaCustomer, tglCheckIn, tglCheckOut, noHp, status, alamat);
    response.sendRedirect("home.jsp");
} catch (Exception ex) {
    System.out.println("Gagal");
}
%>
