<%-- 
    Document   : home
    Created on : Mar 4, 2021, 10:22:09 AM
    Author     : Win_10
--%>

<%@include file="navbar.jsp" %>

<div class="container">
    <div class="table-wrapper" id="printTable">
        <h3 align="center">Daftar Booking Hotel PASTI</h3>
        <div class="d-grid gap-2 d-md-block">
            <a href="tambah.jsp"><button class="btn btn-primary">Tambah</button></a>
        </div>
        
        <hr>
        
        <table class="table table-bordered">
            <thead>
                <tr style="text-align:center">
                    <th>No. Kamar</th>
                    <th>Jenis Kamar</th>
                    <th>Harga</th>
                    <th>Nama Customer</th>
                    <th>Check In</th>
                    <th>Check Out</th>
                    <th>No. HP</th>
                    <th>Status</th>
                    <th>Alamat</th>
                    <th colspan="2">Aksi</th>
                </tr>
            </thead>
        <tbody>
        <tr>

        <%
        try {
            WebServiceClient.KamarHotel service = new WebServiceClient.KamarHotel();
            WebServiceClient.KamarHotelService port= service.getKamarHotelServicePort();
            // TODO process result here
            java.util.List<java.lang.Object> resultRoom = port.tampilBooking();
            for (int i = 0; i < resultRoom.size(); i++) {
            out.println(resultRoom.get(i));
        }
        } catch (Exception ex) {
        // TODO handle custom exceptions here
        }
        %>     
</tr>
</tbody>
</table>
</div>
</div>
</div>
