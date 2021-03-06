
package WebServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "KamarHotel", targetNamespace = "http://WebService/", wsdlLocation = "http://localhost:8080/BookingHotel/KamarHotel?wsdl")
public class KamarHotel
    extends Service
{

    private final static URL KAMARHOTEL_WSDL_LOCATION;
    private final static WebServiceException KAMARHOTEL_EXCEPTION;
    private final static QName KAMARHOTEL_QNAME = new QName("http://WebService/", "KamarHotel");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/BookingHotel/KamarHotel?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KAMARHOTEL_WSDL_LOCATION = url;
        KAMARHOTEL_EXCEPTION = e;
    }

    public KamarHotel() {
        super(__getWsdlLocation(), KAMARHOTEL_QNAME);
    }

    public KamarHotel(WebServiceFeature... features) {
        super(__getWsdlLocation(), KAMARHOTEL_QNAME, features);
    }

    public KamarHotel(URL wsdlLocation) {
        super(wsdlLocation, KAMARHOTEL_QNAME);
    }

    public KamarHotel(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KAMARHOTEL_QNAME, features);
    }

    public KamarHotel(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KamarHotel(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KamarHotelService
     */
    @WebEndpoint(name = "KamarHotel_ServicePort")
    public KamarHotelService getKamarHotelServicePort() {
        return super.getPort(new QName("http://WebService/", "KamarHotel_ServicePort"), KamarHotelService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KamarHotelService
     */
    @WebEndpoint(name = "KamarHotel_ServicePort")
    public KamarHotelService getKamarHotelServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService/", "KamarHotel_ServicePort"), KamarHotelService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KAMARHOTEL_EXCEPTION!= null) {
            throw KAMARHOTEL_EXCEPTION;
        }
        return KAMARHOTEL_WSDL_LOCATION;
    }

}
