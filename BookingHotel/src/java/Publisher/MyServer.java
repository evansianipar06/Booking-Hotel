/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publisher;

import WebService.KamarHotel_Service;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Win_10
 */
public class MyServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:93/bookinghotel", new KamarHotel_Service());
    }
}
