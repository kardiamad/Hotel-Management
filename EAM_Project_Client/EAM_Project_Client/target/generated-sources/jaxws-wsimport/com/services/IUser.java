
package com.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.interfaces.ObjectFactory;
import com.interfaces.User;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IUser", targetNamespace = "http://interfaces.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IUser {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.interfaces.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetUserResponse")
    @Action(input = "http://interfaces.com/IUser/getUserRequest", output = "http://interfaces.com/IUser/getUserResponse")
    public User getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.interfaces.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUserById", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetUserById")
    @ResponseWrapper(localName = "getUserByIdResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.GetUserByIdResponse")
    @Action(input = "http://interfaces.com/IUser/getUserByIdRequest", output = "http://interfaces.com/IUser/getUserByIdResponse")
    public User getUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "createOrReturnUser", targetNamespace = "http://interfaces.com/", className = "com.interfaces.CreateOrReturnUser")
    @ResponseWrapper(localName = "createOrReturnUserResponse", targetNamespace = "http://interfaces.com/", className = "com.interfaces.CreateOrReturnUserResponse")
    @Action(input = "http://interfaces.com/IUser/createOrReturnUserRequest", output = "http://interfaces.com/IUser/createOrReturnUserResponse")
    public int createOrReturnUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
