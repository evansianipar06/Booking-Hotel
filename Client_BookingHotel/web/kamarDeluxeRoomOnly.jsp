<%-- 
    Document   : tambah-booking
    Created on : Mar 4, 2021, 11:07:59 AM
    Author     : Win_10
--%>

<%@include file="navbar.jsp" %>

<div class="container">
    <h3>Tambah Booking Hotel</h3>
    <hr>
    <form class="row g-3" method="post" action="proses-tambah.jsp">
        <div class="col-md-4">
            <label class="form-label" font-style>No. Kamar</label>
            <input type="text" class="form-control" name="kode" placeholder="Masukkan No. Kamar..">
        </div>

        <div class="col-md-4">
            <label class="form-label" font-style>Jenis Kamar</label>
            <input type="text" class="form-control" name="jenisKamar" readonly value="DELUXE ROOM ONLY">
        </div>
        
        <div class="col-md-4">
            <label class="form-label" font-style>Harga Kamar</label>
            <input type="text" class="form-control" name="harga" readonly value="130000">
        </div>

        <div class="col-6">
            <label class="form-label">Nama Customer</label>
            <input type="text" class="form-control" name="namaCustomer" placeholder="Masukkan nama anda...">
        </div>

        <div class="col-6">
            <label class="form-label">No. Hp</label>
            <input type="number" class="form-control" name="noHp" placeholder="Masukkan No. HP anda...">
        </div>
        
        <div class="col-md-6">
            <label class="form-label">Tanggal Check In</label>
            <input type="date" class="form-control" name="tglCheckIn">
        </div>

        <div class="col-md-6">
            <label class="form-label">Tanggal Check Out</label>
            <input type="date" class="form-control" name="tglCheckOut">
        </div>

        <div class="col-md-6">
            <label class="form-label">Status</label>
            <select name="status" class="form-select">
              <option selected>- Status -</option>
              <option>Menikah</option>
              <option>Belum Menikah</option>
            </select>
        </div>

        <div class="col-md-6">
            <label class="form-label">Alamat</label>
            <input type="text" class="form-control" name="alamat" placeholder="Masukkan alamat anda..">
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-primary">Buat</button>
        </div>
    </form>
</div>