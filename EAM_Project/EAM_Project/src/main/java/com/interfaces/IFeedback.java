/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.models.Feedback;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
public interface IFeedback {
    @WebMethod
    @WebResult(name = "feedbacks")
    public List<Feedback> getFeedback();
    
    @WebMethod
    @WebResult(name = "feedback")
    public boolean addFeedback(String username, String msg);
    
    @WebMethod
    @WebResult(name = "feedback")
    public boolean deleteFeedback(int id);
}
