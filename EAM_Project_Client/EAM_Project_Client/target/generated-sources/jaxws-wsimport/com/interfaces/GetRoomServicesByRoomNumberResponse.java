
package com.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoomServicesByRoomNumberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoomServicesByRoomNumberResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="room_number" type="{http://interfaces.com/}roomService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoomServicesByRoomNumberResponse", propOrder = {
    "roomNumber"
})
public class GetRoomServicesByRoomNumberResponse {

    @XmlElement(name = "room_number")
    protected RoomService roomNumber;

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RoomService }
     *     
     */
    public RoomService getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomService }
     *     
     */
    public void setRoomNumber(RoomService value) {
        this.roomNumber = value;
    }

}
