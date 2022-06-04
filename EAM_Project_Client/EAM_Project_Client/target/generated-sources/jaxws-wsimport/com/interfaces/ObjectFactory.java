
package com.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateOrReturnUserResponse_QNAME = new QName("http://interfaces.com/", "createOrReturnUserResponse");
    private final static QName _CreateOrReturnUser_QNAME = new QName("http://interfaces.com/", "createOrReturnUser");
    private final static QName _GetUser_QNAME = new QName("http://interfaces.com/", "getUser");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://interfaces.com/", "getUserByIdResponse");
    private final static QName _GetUserById_QNAME = new QName("http://interfaces.com/", "getUserById");
    private final static QName _GetUserResponse_QNAME = new QName("http://interfaces.com/", "getUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link CreateOrReturnUser }
     * 
     */
    public CreateOrReturnUser createCreateOrReturnUser() {
        return new CreateOrReturnUser();
    }

    /**
     * Create an instance of {@link CreateOrReturnUserResponse }
     * 
     */
    public CreateOrReturnUserResponse createCreateOrReturnUserResponse() {
        return new CreateOrReturnUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrReturnUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.com/", name = "createOrReturnUserResponse")
    public JAXBElement<CreateOrReturnUserResponse> createCreateOrReturnUserResponse(CreateOrReturnUserResponse value) {
        return new JAXBElement<CreateOrReturnUserResponse>(_CreateOrReturnUserResponse_QNAME, CreateOrReturnUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrReturnUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.com/", name = "createOrReturnUser")
    public JAXBElement<CreateOrReturnUser> createCreateOrReturnUser(CreateOrReturnUser value) {
        return new JAXBElement<CreateOrReturnUser>(_CreateOrReturnUser_QNAME, CreateOrReturnUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.com/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.com/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

}
