
package WebServiceClient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "KamarHotel_Service", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface KamarHotelService {


    /**
     * 
     * @param kode
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getKamarHotel", targetNamespace = "http://WebService/", className = "WebServiceClient.GetKamarHotel")
    @ResponseWrapper(localName = "getKamarHotelResponse", targetNamespace = "http://WebService/", className = "WebServiceClient.GetKamarHotelResponse")
    @Action(input = "http://WebService/KamarHotel_Service/getKamarHotelRequest", output = "http://WebService/KamarHotel_Service/getKamarHotelResponse")
    public List<Object> getKamarHotel(
        @WebParam(name = "kode", targetNamespace = "")
        int kode);

    /**
     * 
     * @param tglCheckIn
     * @param harga
     * @param kode
     * @param noHp
     * @param namaCustomer
     * @param tglCheckOut
     * @param jenisKamar
     * @param status
     * @param alamat
     */
    @WebMethod
    @RequestWrapper(localName = "addBooking", targetNamespace = "http://WebService/", className = "WebServiceClient.AddBooking")
    @ResponseWrapper(localName = "addBookingResponse", targetNamespace = "http://WebService/", className = "WebServiceClient.AddBookingResponse")
    @Action(input = "http://WebService/KamarHotel_Service/addBookingRequest", output = "http://WebService/KamarHotel_Service/addBookingResponse")
    public void addBooking(
        @WebParam(name = "kode", targetNamespace = "")
        int kode,
        @WebParam(name = "jenisKamar", targetNamespace = "")
        String jenisKamar,
        @WebParam(name = "harga", targetNamespace = "")
        String harga,
        @WebParam(name = "namaCustomer", targetNamespace = "")
        String namaCustomer,
        @WebParam(name = "tglCheckIn", targetNamespace = "")
        String tglCheckIn,
        @WebParam(name = "tglCheckOut", targetNamespace = "")
        String tglCheckOut,
        @WebParam(name = "noHp", targetNamespace = "")
        String noHp,
        @WebParam(name = "status", targetNamespace = "")
        String status,
        @WebParam(name = "alamat", targetNamespace = "")
        String alamat);

    /**
     * 
     * @param kode
     */
    @WebMethod
    @RequestWrapper(localName = "delBooking", targetNamespace = "http://WebService/", className = "WebServiceClient.DelBooking")
    @ResponseWrapper(localName = "delBookingResponse", targetNamespace = "http://WebService/", className = "WebServiceClient.DelBookingResponse")
    @Action(input = "http://WebService/KamarHotel_Service/delBookingRequest", output = "http://WebService/KamarHotel_Service/delBookingResponse")
    public void delBooking(
        @WebParam(name = "kode", targetNamespace = "")
        int kode);

    /**
     * 
     * @param tglCheckIn
     * @param harga
     * @param kode
     * @param noHp
     * @param namaCustomer
     * @param tglCheckOut
     * @param jenisKamar
     * @param status
     * @param alamat
     */
    @WebMethod
    @RequestWrapper(localName = "editBooking", targetNamespace = "http://WebService/", className = "WebServiceClient.EditBooking")
    @ResponseWrapper(localName = "editBookingResponse", targetNamespace = "http://WebService/", className = "WebServiceClient.EditBookingResponse")
    @Action(input = "http://WebService/KamarHotel_Service/editBookingRequest", output = "http://WebService/KamarHotel_Service/editBookingResponse")
    public void editBooking(
        @WebParam(name = "kode", targetNamespace = "")
        int kode,
        @WebParam(name = "jenisKamar", targetNamespace = "")
        String jenisKamar,
        @WebParam(name = "harga", targetNamespace = "")
        String harga,
        @WebParam(name = "namaCustomer", targetNamespace = "")
        String namaCustomer,
        @WebParam(name = "tglCheckIn", targetNamespace = "")
        String tglCheckIn,
        @WebParam(name = "tglCheckOut", targetNamespace = "")
        String tglCheckOut,
        @WebParam(name = "noHp", targetNamespace = "")
        String noHp,
        @WebParam(name = "status", targetNamespace = "")
        String status,
        @WebParam(name = "alamat", targetNamespace = "")
        String alamat);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tampilBooking", targetNamespace = "http://WebService/", className = "WebServiceClient.TampilBooking")
    @ResponseWrapper(localName = "tampilBookingResponse", targetNamespace = "http://WebService/", className = "WebServiceClient.TampilBookingResponse")
    @Action(input = "http://WebService/KamarHotel_Service/tampilBookingRequest", output = "http://WebService/KamarHotel_Service/tampilBookingResponse")
    public List<Object> tampilBooking();

}