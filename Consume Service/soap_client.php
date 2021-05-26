<?php
    $kode = $_POST['kode'];
    $jenisKamar = $_POST['jenisKamar'];
    $harga = $_POST['harga'];
    $namaCustomer = $_POST['namaCustomer'];
    $tglCheckIn = $_POST['tglCheckIn'];
    $tglCheckOut = $_POST['tglCheckOut'];
    $noHp = $_POST['noHp'];
    $status= $_POST['status'];
    $alamat = $_POST['alamat'];

    try{
        $wsdl_add = "http://localhost:93/bookinghotel?wsdl";
        $api = new SoapClient($wsdl_add);
        $response = $api->addBooking(array('kode'=>$kode, 'jenisKamar'=>$jenisKamar, 'harga'=>$harga,
                  'namaCustomer'=>$namaCustomer, 'tglCheckIn'=>$tglCheckIn, 'tglCheckOut'=>$tglCheckOut, 
                  'noHp'=>$noHp,'status'=>$status, 'alamat'=>$alamat));
      echo '<h1 style="text-align: center">Sukses Booking Hotel</h1>';
      echo '<a href="home.php"><h2 style="text-align: center">Back to Dashboard</h2></a>';
      }
    catch(SOAPFault $Exception){
        echo $Exception;
    }
?>