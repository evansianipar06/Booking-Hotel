<!DOCTYPE html>
<html lang="en">
<head>
    <title>Client</title>
    <link rel="stylesheet" type="text/css" href="./css/bootstrap.css">
	<script type="text/javascript" src="./js/jquery.js"></script>
	<script type="text/javascript" src="./js/bootstrap.js"></script>	

</head>
<body >
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
              <a class="navbar-brand" href="home.php">Booking Hotel PASTI</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="home.php">Home</a>
                  </li>
                  </li>
                </ul>
              </div>
            </div>
        </nav>
    <div class="jumbotron">
        <div class="container">
        <h3>Booking Hotel PASTI</h3>
        <hr>
        <form class="row g-3" method="post" action="soap_client.php">
        <div class="col-md-4">
            <label class="form-label" font-style>No. Kamar</label>
            <input type="text" class="form-control" name="kode" placeholder="Masukkan No. Kamar..">
        </div>

        <div class="col-md-4">
            <label class="form-label" font-style>Jenis Kamar</label>
            <input type="text" class="form-control" name="jenisKamar" readonly value="SUITE">
        </div>
        
        <div class="col-md-4">
            <label class="form-label" font-style>Harga Kamar</label>
            <input type="text" class="form-control" name="harga" readonly value="180000">
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
            <button type="submit" class="btn btn-primary">Booking</button>
        </div>
    </form>

        </div>
    </div>
</body>
</html>