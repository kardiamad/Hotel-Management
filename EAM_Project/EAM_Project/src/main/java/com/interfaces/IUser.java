/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.models.User;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IUser {
    @WebMethod
    @WebResult(name = "user")
    public User getUser(String name, String password);
    
    @WebMethod
    @WebResult(name = "user")
    public User getUserById(int id);
    
    @WebMethod
    @WebResult(name = "user")
    public int createOrReturnUser(String name, String password);
}
