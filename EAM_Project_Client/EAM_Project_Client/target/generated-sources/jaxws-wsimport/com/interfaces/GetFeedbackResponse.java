
package com.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFeedbackResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFeedbackResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedbacks" type="{http://interfaces.com/}feedback" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFeedbackResponse", propOrder = {
    "feedbacks"
})
public class GetFeedbackResponse {

    protected List<Feedback> feedbacks;

    /**
     * Gets the value of the feedbacks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbacks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbacks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feedback }
     * 
     * 
     */
    public List<Feedback> getFeedbacks() {
        if (feedbacks == null) {
            feedbacks = new ArrayList<Feedback>();
        }
        return this.feedbacks;
    }

}
