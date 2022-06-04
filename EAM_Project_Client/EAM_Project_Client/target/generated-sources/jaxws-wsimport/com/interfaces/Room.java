
package com.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bathroom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bedroom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user_FName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_LName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vacant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = {
    "additionalServices",
    "bathroom",
    "bedroom",
    "number",
    "phone",
    "tv",
    "userFName",
    "userLName",
    "userEmail",
    "userId",
    "userPhone",
    "vacant"
})
public class Room {

    protected String additionalServices;
    protected int bathroom;
    protected int bedroom;
    protected int number;
    protected String phone;
    protected int tv;
    @XmlElement(name = "user_FName")
    protected String userFName;
    @XmlElement(name = "user_LName")
    protected String userLName;
    @XmlElement(name = "user_email")
    protected String userEmail;
    @XmlElement(name = "user_id")
    protected int userId;
    @XmlElement(name = "user_phone")
    protected String userPhone;
    protected String vacant;

    /**
     * Gets the value of the additionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Sets the value of the additionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServices(String value) {
        this.additionalServices = value;
    }

    /**
     * Gets the value of the bathroom property.
     * 
     */
    public int getBathroom() {
        return bathroom;
    }

    /**
     * Sets the value of the bathroom property.
     * 
     */
    public void setBathroom(int value) {
        this.bathroom = value;
    }

    /**
     * Gets the value of the bedroom property.
     * 
     */
    public int getBedroom() {
        return bedroom;
    }

    /**
     * Sets the value of the bedroom property.
     * 
     */
    public void setBedroom(int value) {
        this.bedroom = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the tv property.
     * 
     */
    public int getTv() {
        return tv;
    }

    /**
     * Sets the value of the tv property.
     * 
     */
    public void setTv(int value) {
        this.tv = value;
    }

    /**
     * Gets the value of the userFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFName() {
        return userFName;
    }

    /**
     * Sets the value of the userFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFName(String value) {
        this.userFName = value;
    }

    /**
     * Gets the value of the userLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLName() {
        return userLName;
    }

    /**
     * Sets the value of the userLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLName(String value) {
        this.userLName = value;
    }

    /**
     * Gets the value of the userEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets the value of the userEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Sets the value of the userPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPhone(String value) {
        this.userPhone = value;
    }

    /**
     * Gets the value of the vacant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacant() {
        return vacant;
    }

    /**
     * Sets the value of the vacant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacant(String value) {
        this.vacant = value;
    }

}
