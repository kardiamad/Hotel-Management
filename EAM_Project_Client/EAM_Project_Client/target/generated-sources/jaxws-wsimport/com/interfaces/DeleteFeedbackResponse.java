
package com.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteFeedbackResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteFeedbackResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteFeedbackResponse", propOrder = {
    "feedback"
})
public class DeleteFeedbackResponse {

    protected boolean feedback;

    /**
     * Gets the value of the feedback property.
     * 
     */
    public boolean isFeedback() {
        return feedback;
    }

    /**
     * Sets the value of the feedback property.
     * 
     */
    public void setFeedback(boolean value) {
        this.feedback = value;
    }

}
