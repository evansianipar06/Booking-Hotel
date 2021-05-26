
package WebServiceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jenisKamar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="namaCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tglCheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tglCheckOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noHp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editBooking", propOrder = {
    "kode",
    "jenisKamar",
    "harga",
    "namaCustomer",
    "tglCheckIn",
    "tglCheckOut",
    "noHp",
    "status",
    "alamat"
})
public class EditBooking {

    protected int kode;
    protected String jenisKamar;
    protected String harga;
    protected String namaCustomer;
    protected String tglCheckIn;
    protected String tglCheckOut;
    protected String noHp;
    protected String status;
    protected String alamat;

    /**
     * Gets the value of the kode property.
     * 
     */
    public int getKode() {
        return kode;
    }

    /**
     * Sets the value of the kode property.
     * 
     */
    public void setKode(int value) {
        this.kode = value;
    }

    /**
     * Gets the value of the jenisKamar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenisKamar() {
        return jenisKamar;
    }

    /**
     * Sets the value of the jenisKamar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenisKamar(String value) {
        this.jenisKamar = value;
    }

    /**
     * Gets the value of the harga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarga(String value) {
        this.harga = value;
    }

    /**
     * Gets the value of the namaCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaCustomer() {
        return namaCustomer;
    }

    /**
     * Sets the value of the namaCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaCustomer(String value) {
        this.namaCustomer = value;
    }

    /**
     * Gets the value of the tglCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglCheckIn() {
        return tglCheckIn;
    }

    /**
     * Sets the value of the tglCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglCheckIn(String value) {
        this.tglCheckIn = value;
    }

    /**
     * Gets the value of the tglCheckOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglCheckOut() {
        return tglCheckOut;
    }

    /**
     * Sets the value of the tglCheckOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglCheckOut(String value) {
        this.tglCheckOut = value;
    }

    /**
     * Gets the value of the noHp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoHp() {
        return noHp;
    }

    /**
     * Sets the value of the noHp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoHp(String value) {
        this.noHp = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
    }

}
