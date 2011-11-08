
package com.sones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.sones_library_commons.SecurityToken;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongStreampETKBXRm;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StreamedService", targetNamespace = "http://www.sones.com")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.sones.ObjectFactory.class,
    org.datacontract.schemas._2004._07.sones_library_commons.ObjectFactory.class,
    org.datacontract.schemas._2004._07.system.ObjectFactory.class
})
public interface StreamedService {


    /**
     * 
     * @param myTransToken
     * @param myVertex
     * @param mySecurityToken
     * @param myPropertyID
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "GetBinaryProperty", action = "http://www.sones.com/StreamedService/GetBinaryProperty")
    @WebResult(name = "GetBinaryPropertyResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetBinaryProperty", targetNamespace = "http://www.sones.com", className = "com.sones.GetBinaryProperty")
    @ResponseWrapper(localName = "GetBinaryPropertyResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetBinaryPropertyResponse")
    public byte[] getBinaryProperty(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        SecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myVertex", targetNamespace = "http://www.sones.com")
        ServiceVertexInstance myVertex,
        @WebParam(name = "myPropertyID", targetNamespace = "http://www.sones.com")
        Long myPropertyID);

    /**
     * 
     * @param myTransToken
     * @param myVertex
     * @param mySecurityToken
     * @return
     *     returns org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongStreampETKBXRm
     */
    @WebMethod(operationName = "GetAllBinaryProperties", action = "http://www.sones.com/StreamedService/GetAllBinaryProperties")
    @WebResult(name = "GetAllBinaryPropertiesResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetAllBinaryProperties", targetNamespace = "http://www.sones.com", className = "com.sones.GetAllBinaryProperties")
    @ResponseWrapper(localName = "GetAllBinaryPropertiesResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetAllBinaryPropertiesResponse")
    public ArrayOfTupleOflongStreampETKBXRm getAllBinaryProperties(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        SecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myVertex", targetNamespace = "http://www.sones.com")
        ServiceVertexInstance myVertex);

    /**
     * 
     * @param parameters
     */
    @WebMethod(operationName = "SetBinaryProperty", action = "http://www.sones.com/StreamedService/SetBinaryProperty")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void setBinaryProperty(
        @WebParam(name = "SetBinaryPropertyMessage", targetNamespace = "http://www.sones.com", partName = "parameters")
        SetBinaryPropertyMessage parameters);

}
