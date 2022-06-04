
package com.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="room_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="towel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomService", propOrder = {
    "approved",
    "flower",
    "id",
    "roomNumber",
    "scent",
    "towel"
})
public class RoomService {

    protected String approved;
    protected int flower;
    protected int id;
    @XmlElement(name = "room_number")
    protected int roomNumber;
    protected String scent;
    protected int towel;

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproved(String value) {
        this.approved = value;
    }

    /**
     * Gets the value of the flower property.
     * 
     */
    public int getFlower() {
        return flower;
    }

    /**
     * Sets the value of the flower property.
     * 
     */
    public void setFlower(int value) {
        this.flower = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     */
    public void setRoomNumber(int value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the scent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScent() {
        return scent;
    }

    /**
     * Sets the value of the scent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScent(String value) {
        this.scent = value;
    }

    /**
     * Gets the value of the towel property.
     * 
     */
    public int getTowel() {
        return towel;
    }

    /**
     * Sets the value of the towel property.
     * 
     */
    public void setTowel(int value) {
        this.towel = value;
    }

}
