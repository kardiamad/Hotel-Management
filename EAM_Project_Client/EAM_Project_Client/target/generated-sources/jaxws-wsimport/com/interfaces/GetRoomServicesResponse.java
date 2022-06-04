
package com.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoomServicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoomServicesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="room_services" type="{http://interfaces.com/}roomService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoomServicesResponse", propOrder = {
    "roomServices"
})
public class GetRoomServicesResponse {

    @XmlElement(name = "room_services")
    protected List<RoomService> roomServices;

    /**
     * Gets the value of the roomServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomService }
     * 
     * 
     */
    public List<RoomService> getRoomServices() {
        if (roomServices == null) {
            roomServices = new ArrayList<RoomService>();
        }
        return this.roomServices;
    }

}
