/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Connection.MySQL_Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Win_10
 */
@WebService(serviceName = "KamarHotel")
public class KamarHotel_Service {

    MySQL_Connection kon = new MySQL_Connection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @WebMethod(operationName = "addBooking")
    public void addKamar(
        @WebParam(name = "kode") int kode,
        @WebParam(name = "jenisKamar") String jenisKamar,
        @WebParam(name = "harga") String harga,
        @WebParam(name = "namaCustomer") String namaCustomer,
        @WebParam(name = "tglCheckIn") String tglCheckIn,
        @WebParam(name = "tglCheckOut") String tglCheckOut,
        @WebParam(name = "noHp") String noHp,
        @WebParam(name = "status") String status,
        @WebParam(name = "alamat") String alamat
    ) {
    try {
        con = kon.getCon();
        ps = con.prepareStatement("INSERT INTO bookinghotel VALUE (?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, kode);
        ps.setString(2, jenisKamar);
        ps.setString(3, harga);
        ps.setString(4, namaCustomer);
        ps.setString(5, tglCheckIn);
        ps.setString(6, tglCheckOut);
        ps.setString(7, noHp);
        ps.setString(8, status);
        ps.setString(9, alamat);
        ps.executeUpdate();
    } catch (Exception ex) {
        System.out.println("Gagal menambahkan !!!");
    }
    }
    
    @WebMethod(operationName = "getKamarHotel")
    public List getKamarHotel(
    @WebParam(name = "kode") int kode) {
    List bookinghotel = new ArrayList();
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_kamar_hotel2", "root", "");
        Statement st = conn.createStatement();
        con = kon.getCon();
        ps = con.prepareStatement("SELECT * FROM bookinghotel WHERE kode=?");
        ps.setInt(1, kode);
        ResultSet rst = ps.executeQuery();
        
        while (rst.next()) {
            bookinghotel.add("<div class=\"form-group\">\n" +
            " <b><label class=\"class=\"form-label\" font-style\">No. Kamar</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"kode\"value=\""
                    +rst.getInt("kode")+"\" readonly=\"true\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n<br>" +
    
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">Jenis Kamar</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"jenisKamar\" value=\""
                    +rst.getString("jenisKamar")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n <br>" +
                            
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">Harga</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"harga\" value=\""
                    +rst.getString("harga")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n <br>" +               
                    
            " <div class=\"form-group\">\n" +
            " <label class=\"form-label\" font-style\">Nama Customer</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"namaCustomer\" value=\""
                    +rst.getString("namaCustomer")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n <br>" +
                    
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">Check In</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"date\" class=\"form-control\" name=\"tglCheckIn\" value=\""
                    +rst.getString("tglCheckIn")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n <br>" +
                    
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">Check Out</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"date\" class=\"form-control\" name=\"tglCheckOut\" value=\""
                    +rst.getString("tglCheckOut")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n <br>" +
                    
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">No. HP</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"noHp\" value=\""
                    +rst.getString("noHp")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n <br>" +
                    
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">Status</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"status\" value=\""
                    +rst.getString("status")+"\">\n" +
            " </div>\n" +
            " </div>\n" +
            " \n<br>" +
                    
            " <div class=\"form-group\">\n" +
            " <label class=\"control-label col-sm-1\">Alamat</label>\n" +
            " <div class=\"col-md-6\">\n" +
            " <input type=\"text\" class=\"form-control\" name=\"alamat\" value=\""
                    +rst.getString("alamat")+"\">\n" +" </div>\n" +" </div>");
            
        }
    } catch (Exception ex) {
        System.out.println("GAGAL !!");
    }
        return bookinghotel;
    }
    
    @WebMethod(operationName = "delBooking")
    public void delKamar(
    @WebParam(name = "kode") int kode) {
    try {
        con = kon.getCon();
        ps = con.prepareStatement("DELETE FROM bookinghotel WHERE kode = ?");
        ps.setInt(1, kode);
        ps.executeUpdate();
    } catch (Exception e) {
        System.out.println("Gagal menghapus !");
    }
    }
    
    @WebMethod(operationName = "editBooking")
    public void editKamar(
        @WebParam(name = "kode") int kode,
        @WebParam(name = "jenisKamar") String jenisKamar,
        @WebParam(name = "harga") String harga,
        @WebParam(name = "namaCustomer") String namaCustomer,
        @WebParam(name = "tglCheckIn") String tglCheckIn,
        @WebParam(name = "tglCheckOut") String tglCheckOut,
        @WebParam(name = "noHp") String noHp,
        @WebParam(name = "status") String status,
        @WebParam(name = "alamat") String alamat){
    try {
        con = kon.getCon();
        ps = con.prepareStatement("UPDATE bookinghotel SET jenisKamar=?,harga=?,namaCustomer=?,tglCheckIn=?,tglCheckOut=?,noHp=?,status=?,alamat=? WHERE kode=?");
        ps.setString(1, jenisKamar);
        ps.setString(2, harga);
        ps.setString(3, namaCustomer);
        ps.setString(4, tglCheckIn);
        ps.setString(5, tglCheckOut);
        ps.setString(6, noHp);
        ps.setString(7, status);
        ps.setString(8, alamat);
        ps.setInt(9, kode);
        ps.executeUpdate();
    } catch (Exception e) {
        System.out.println("Gagal mengedit !");
    }
    }
    
    @WebMethod(operationName = "tampilBooking")
    public List tampilKamar() {
    List daftar = new ArrayList();
    String sql_daftar = "SELECT * FROM  bookinghotel";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_kamar_hotel2", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql_daftar);
        while (rs.next()) {
                daftar.add("<td>" + rs.getInt("kode") + "</td><td>" + 
                                    rs.getString("jenisKamar") + "</td><td>" + 
                                    rs.getString("harga") + "</td><td>" +
                                    rs.getString("namaCustomer") + "</td><td>" + 
                                    rs.getString("tglCheckIn") + "</td><td>" + 
                                    rs.getString("tglCheckOut") + "</td><td>" + 
                                    rs.getString("noHp") + "</td><td>" + 
                                    rs.getString("status") + "</td><td>" + 
                                    rs.getString("alamat") + 
                            "</td><td><a href=\"edit.jsp?kode=" + rs.getString("kode") 
                            + "\"><button class=\"btn btn-info\">Edit</button></a><br>"
                            + "</td><td><a href=\"hapus.jsp?kode=" + rs.getString("kode") 
                            +"\" onClick=\"return confirm('Apakah Yakin Hapus Data Booking ?');\">"
                            + "<button class=\"btn btn-danger\">Hapus</button></a></td><tr></tr>");
        }
        con.close();
    } catch (Exception ex) {
        System.out.println("Gagal !!!");
    }
        return daftar;
    }
}
