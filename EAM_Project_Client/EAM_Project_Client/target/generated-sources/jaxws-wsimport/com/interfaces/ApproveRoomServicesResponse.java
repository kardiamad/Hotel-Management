
package com.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approveRoomServicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approveRoomServicesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="room_number" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approveRoomServicesResponse", propOrder = {
    "roomNumber"
})
public class ApproveRoomServicesResponse {

    @XmlElement(name = "room_number")
    protected boolean roomNumber;

    /**
     * Gets the value of the roomNumber property.
     * 
     */
    public boolean isRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     */
    public void setRoomNumber(boolean value) {
        this.roomNumber = value;
    }

}
