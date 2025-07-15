
package com.example.userProfile.soap.userService;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.userProfile.soap.userService package. 
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

    private final static QName _GeneralException_QNAME = new QName("http://service.userService.example.com/", "GeneralException");
    private final static QName _GetUserByEmail_QNAME = new QName("http://service.userService.example.com/", "getUserByEmail");
    private final static QName _GetUserByEmailResponse_QNAME = new QName("http://service.userService.example.com/", "getUserByEmailResponse");
    private final static QName _GetUserById_QNAME = new QName("http://service.userService.example.com/", "getUserById");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://service.userService.example.com/", "getUserByIdResponse");
    private final static QName _Publish_QNAME = new QName("http://service.userService.example.com/", "publish");
    private final static QName _PublishResponse_QNAME = new QName("http://service.userService.example.com/", "publishResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.userProfile.soap.userService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralException }
     * 
     */
    public GeneralException createGeneralException() {
        return new GeneralException();
    }

    /**
     * Create an instance of {@link GetUserByEmail }
     * 
     */
    public GetUserByEmail createGetUserByEmail() {
        return new GetUserByEmail();
    }

    /**
     * Create an instance of {@link GetUserByEmailResponse }
     * 
     */
    public GetUserByEmailResponse createGetUserByEmailResponse() {
        return new GetUserByEmailResponse();
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
     * Create an instance of {@link Publish }
     * 
     */
    public Publish createPublish() {
        return new Publish();
    }

    /**
     * Create an instance of {@link PublishResponse }
     * 
     */
    public PublishResponse createPublishResponse() {
        return new PublishResponse();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeneralException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "GeneralException")
    public JAXBElement<GeneralException> createGeneralException(GeneralException value) {
        return new JAXBElement<GeneralException>(_GeneralException_QNAME, GeneralException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserByEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "getUserByEmail")
    public JAXBElement<GetUserByEmail> createGetUserByEmail(GetUserByEmail value) {
        return new JAXBElement<GetUserByEmail>(_GetUserByEmail_QNAME, GetUserByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserByEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "getUserByEmailResponse")
    public JAXBElement<GetUserByEmailResponse> createGetUserByEmailResponse(GetUserByEmailResponse value) {
        return new JAXBElement<GetUserByEmailResponse>(_GetUserByEmailResponse_QNAME, GetUserByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publish }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Publish }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "publish")
    public JAXBElement<Publish> createPublish(Publish value) {
        return new JAXBElement<Publish>(_Publish_QNAME, Publish.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublishResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.userService.example.com/", name = "publishResponse")
    public JAXBElement<PublishResponse> createPublishResponse(PublishResponse value) {
        return new JAXBElement<PublishResponse>(_PublishResponse_QNAME, PublishResponse.class, null, value);
    }

}
