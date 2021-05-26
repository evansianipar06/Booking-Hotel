
package WebServiceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WebServiceClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddBooking_QNAME = new QName("http://WebService/", "addBooking");
    private final static QName _AddBookingResponse_QNAME = new QName("http://WebService/", "addBookingResponse");
    private final static QName _DelBooking_QNAME = new QName("http://WebService/", "delBooking");
    private final static QName _DelBookingResponse_QNAME = new QName("http://WebService/", "delBookingResponse");
    private final static QName _EditBooking_QNAME = new QName("http://WebService/", "editBooking");
    private final static QName _EditBookingResponse_QNAME = new QName("http://WebService/", "editBookingResponse");
    private final static QName _GetKamarHotel_QNAME = new QName("http://WebService/", "getKamarHotel");
    private final static QName _GetKamarHotelResponse_QNAME = new QName("http://WebService/", "getKamarHotelResponse");
    private final static QName _TampilBooking_QNAME = new QName("http://WebService/", "tampilBooking");
    private final static QName _TampilBookingResponse_QNAME = new QName("http://WebService/", "tampilBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WebServiceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBooking }
     * 
     */
    public AddBooking createAddBooking() {
        return new AddBooking();
    }

    /**
     * Create an instance of {@link AddBookingResponse }
     * 
     */
    public AddBookingResponse createAddBookingResponse() {
        return new AddBookingResponse();
    }

    /**
     * Create an instance of {@link DelBooking }
     * 
     */
    public DelBooking createDelBooking() {
        return new DelBooking();
    }

    /**
     * Create an instance of {@link DelBookingResponse }
     * 
     */
    public DelBookingResponse createDelBookingResponse() {
        return new DelBookingResponse();
    }

    /**
     * Create an instance of {@link EditBooking }
     * 
     */
    public EditBooking createEditBooking() {
        return new EditBooking();
    }

    /**
     * Create an instance of {@link EditBookingResponse }
     * 
     */
    public EditBookingResponse createEditBookingResponse() {
        return new EditBookingResponse();
    }

    /**
     * Create an instance of {@link GetKamarHotel }
     * 
     */
    public GetKamarHotel createGetKamarHotel() {
        return new GetKamarHotel();
    }

    /**
     * Create an instance of {@link GetKamarHotelResponse }
     * 
     */
    public GetKamarHotelResponse createGetKamarHotelResponse() {
        return new GetKamarHotelResponse();
    }

    /**
     * Create an instance of {@link TampilBooking }
     * 
     */
    public TampilBooking createTampilBooking() {
        return new TampilBooking();
    }

    /**
     * Create an instance of {@link TampilBookingResponse }
     * 
     */
    public TampilBookingResponse createTampilBookingResponse() {
        return new TampilBookingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "addBooking")
    public JAXBElement<AddBooking> createAddBooking(AddBooking value) {
        return new JAXBElement<AddBooking>(_AddBooking_QNAME, AddBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "addBookingResponse")
    public JAXBElement<AddBookingResponse> createAddBookingResponse(AddBookingResponse value) {
        return new JAXBElement<AddBookingResponse>(_AddBookingResponse_QNAME, AddBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "delBooking")
    public JAXBElement<DelBooking> createDelBooking(DelBooking value) {
        return new JAXBElement<DelBooking>(_DelBooking_QNAME, DelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "delBookingResponse")
    public JAXBElement<DelBookingResponse> createDelBookingResponse(DelBookingResponse value) {
        return new JAXBElement<DelBookingResponse>(_DelBookingResponse_QNAME, DelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "editBooking")
    public JAXBElement<EditBooking> createEditBooking(EditBooking value) {
        return new JAXBElement<EditBooking>(_EditBooking_QNAME, EditBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "editBookingResponse")
    public JAXBElement<EditBookingResponse> createEditBookingResponse(EditBookingResponse value) {
        return new JAXBElement<EditBookingResponse>(_EditBookingResponse_QNAME, EditBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKamarHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetKamarHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getKamarHotel")
    public JAXBElement<GetKamarHotel> createGetKamarHotel(GetKamarHotel value) {
        return new JAXBElement<GetKamarHotel>(_GetKamarHotel_QNAME, GetKamarHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKamarHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetKamarHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getKamarHotelResponse")
    public JAXBElement<GetKamarHotelResponse> createGetKamarHotelResponse(GetKamarHotelResponse value) {
        return new JAXBElement<GetKamarHotelResponse>(_GetKamarHotelResponse_QNAME, GetKamarHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TampilBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "tampilBooking")
    public JAXBElement<TampilBooking> createTampilBooking(TampilBooking value) {
        return new JAXBElement<TampilBooking>(_TampilBooking_QNAME, TampilBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TampilBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "tampilBookingResponse")
    public JAXBElement<TampilBookingResponse> createTampilBookingResponse(TampilBookingResponse value) {
        return new JAXBElement<TampilBookingResponse>(_TampilBookingResponse_QNAME, TampilBookingResponse.class, null, value);
    }

}
