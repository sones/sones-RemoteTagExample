
package com.sones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EdgeTypeService", targetNamespace = "http://www.sones.com")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.sones.ObjectFactory.class,
    org.datacontract.schemas._2004._07.system.ObjectFactory.class
})
public interface EdgeTypeService {


    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "GetDescendantEdgeTypes", action = "http://www.sones.com/EdgeTypeService/GetDescendantEdgeTypes")
    @WebResult(name = "GetDescendantEdgeTypesResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetDescendantEdgeTypes", targetNamespace = "http://www.sones.com", className = "com.sones.GetDescendantEdgeTypes")
    @ResponseWrapper(localName = "GetDescendantEdgeTypesResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetDescendantEdgeTypesResponse")
    public ArrayOfServiceEdgeType getDescendantEdgeTypes(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "GetDescendantEdgeTypesAndSelf", action = "http://www.sones.com/EdgeTypeService/GetDescendantEdgeTypesAndSelf")
    @WebResult(name = "GetDescendantEdgeTypesAndSelfResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetDescendantEdgeTypesAndSelf", targetNamespace = "http://www.sones.com", className = "com.sones.GetDescendantEdgeTypesAndSelf")
    @ResponseWrapper(localName = "GetDescendantEdgeTypesAndSelfResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetDescendantEdgeTypesAndSelfResponse")
    public ArrayOfServiceEdgeType getDescendantEdgeTypesAndSelf(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "GetAncestorEdgeTypes", action = "http://www.sones.com/EdgeTypeService/GetAncestorEdgeTypes")
    @WebResult(name = "GetAncestorEdgeTypesResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetAncestorEdgeTypes", targetNamespace = "http://www.sones.com", className = "com.sones.GetAncestorEdgeTypes")
    @ResponseWrapper(localName = "GetAncestorEdgeTypesResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetAncestorEdgeTypesResponse")
    public ArrayOfServiceEdgeType getAncestorEdgeTypes(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "GetAncestorEdgeTypesAndSelf", action = "http://www.sones.com/EdgeTypeService/GetAncestorEdgeTypesAndSelf")
    @WebResult(name = "GetAncestorEdgeTypesAndSelfResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetAncestorEdgeTypesAndSelf", targetNamespace = "http://www.sones.com", className = "com.sones.GetAncestorEdgeTypesAndSelf")
    @ResponseWrapper(localName = "GetAncestorEdgeTypesAndSelfResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetAncestorEdgeTypesAndSelfResponse")
    public ArrayOfServiceEdgeType getAncestorEdgeTypesAndSelf(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "GetKinsmenEdgeTypes", action = "http://www.sones.com/EdgeTypeService/GetKinsmenEdgeTypes")
    @WebResult(name = "GetKinsmenEdgeTypesResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetKinsmenEdgeTypes", targetNamespace = "http://www.sones.com", className = "com.sones.GetKinsmenEdgeTypes")
    @ResponseWrapper(localName = "GetKinsmenEdgeTypesResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetKinsmenEdgeTypesResponse")
    public ArrayOfServiceEdgeType getKinsmenEdgeTypes(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "GetKinsmenEdgeTypesAndSelf", action = "http://www.sones.com/EdgeTypeService/GetKinsmenEdgeTypesAndSelf")
    @WebResult(name = "GetKinsmenEdgeTypesAndSelfResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetKinsmenEdgeTypesAndSelf", targetNamespace = "http://www.sones.com", className = "com.sones.GetKinsmenEdgeTypesAndSelf")
    @ResponseWrapper(localName = "GetKinsmenEdgeTypesAndSelfResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetKinsmenEdgeTypesAndSelfResponse")
    public ArrayOfServiceEdgeType getKinsmenEdgeTypesAndSelf(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ArrayOfServiceEdgeType
     */
    @WebMethod(operationName = "ChildrenEdgeTypes", action = "http://www.sones.com/EdgeTypeService/ChildrenEdgeTypes")
    @WebResult(name = "ChildrenEdgeTypesResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "ChildrenEdgeTypes", targetNamespace = "http://www.sones.com", className = "com.sones.ChildrenEdgeTypes")
    @ResponseWrapper(localName = "ChildrenEdgeTypesResponse", targetNamespace = "http://www.sones.com", className = "com.sones.ChildrenEdgeTypesResponse")
    public ArrayOfServiceEdgeType childrenEdgeTypes(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ServiceEdgeType
     */
    @WebMethod(operationName = "ParentEdgeType", action = "http://www.sones.com/EdgeTypeService/ParentEdgeType")
    @WebResult(name = "ParentEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "ParentEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.ParentEdgeType")
    @ResponseWrapper(localName = "ParentEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.ParentEdgeTypeResponse")
    public ServiceEdgeType parentEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsSealedByEdgeType", action = "http://www.sones.com/EdgeTypeService/IsSealedByEdgeType")
    @WebResult(name = "IsSealedByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "IsSealedByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.IsSealedByEdgeType")
    @ResponseWrapper(localName = "IsSealedByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.IsSealedByEdgeTypeResponse")
    public Boolean isSealedByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "HasParentTypeByEdgeType", action = "http://www.sones.com/EdgeTypeService/HasParentTypeByEdgeType")
    @WebResult(name = "HasParentTypeByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "HasParentTypeByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.HasParentTypeByEdgeType")
    @ResponseWrapper(localName = "HasParentTypeByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.HasParentTypeByEdgeTypeResponse")
    public Boolean hasParentTypeByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "HasChildTypesByEdgeType", action = "http://www.sones.com/EdgeTypeService/HasChildTypesByEdgeType")
    @WebResult(name = "HasChildTypesByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "HasChildTypesByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.HasChildTypesByEdgeType")
    @ResponseWrapper(localName = "HasChildTypesByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.HasChildTypesByEdgeTypeResponse")
    public Boolean hasChildTypesByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType);

    /**
     * 
     * @param myOtherType
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsAncestorByEdgeType", action = "http://www.sones.com/EdgeTypeService/IsAncestorByEdgeType")
    @WebResult(name = "IsAncestorByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "IsAncestorByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.IsAncestorByEdgeType")
    @ResponseWrapper(localName = "IsAncestorByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.IsAncestorByEdgeTypeResponse")
    public Boolean isAncestorByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myOtherType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myOtherType);

    /**
     * 
     * @param myOtherType
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsAncestorOrSelfByEdgeType", action = "http://www.sones.com/EdgeTypeService/IsAncestorOrSelfByEdgeType")
    @WebResult(name = "IsAncestorOrSelfByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "IsAncestorOrSelfByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.IsAncestorOrSelfByEdgeType")
    @ResponseWrapper(localName = "IsAncestorOrSelfByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.IsAncestorOrSelfByEdgeTypeResponse")
    public Boolean isAncestorOrSelfByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myOtherType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myOtherType);

    /**
     * 
     * @param myOtherType
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsDescendantByEdgeType", action = "http://www.sones.com/EdgeTypeService/IsDescendantByEdgeType")
    @WebResult(name = "IsDescendantByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "IsDescendantByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.IsDescendantByEdgeType")
    @ResponseWrapper(localName = "IsDescendantByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.IsDescendantByEdgeTypeResponse")
    public Boolean isDescendantByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myOtherType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myOtherType);

    /**
     * 
     * @param myOtherType
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsDescendantOrSelfByEdgeType", action = "http://www.sones.com/EdgeTypeService/IsDescendantOrSelfByEdgeType")
    @WebResult(name = "IsDescendantOrSelfByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "IsDescendantOrSelfByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.IsDescendantOrSelfByEdgeType")
    @ResponseWrapper(localName = "IsDescendantOrSelfByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.IsDescendantOrSelfByEdgeTypeResponse")
    public Boolean isDescendantOrSelfByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myOtherType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myOtherType);

    /**
     * 
     * @param myTransToken
     * @param myAttributeName
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "HasAttributeByEdgeType", action = "http://www.sones.com/EdgeTypeService/HasAttributeByEdgeType")
    @WebResult(name = "HasAttributeByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "HasAttributeByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.HasAttributeByEdgeType")
    @ResponseWrapper(localName = "HasAttributeByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.HasAttributeByEdgeTypeResponse")
    public Boolean hasAttributeByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myAttributeName", targetNamespace = "http://www.sones.com")
        String myAttributeName);

    /**
     * 
     * @param myTransToken
     * @param myAttributeName
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ServiceAttributeDefinition
     */
    @WebMethod(operationName = "GetAttributeDefinitionByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetAttributeDefinitionByEdgeType")
    @WebResult(name = "GetAttributeDefinitionByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetAttributeDefinitionByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetAttributeDefinitionByEdgeType")
    @ResponseWrapper(localName = "GetAttributeDefinitionByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetAttributeDefinitionByEdgeTypeResponse")
    public ServiceAttributeDefinition getAttributeDefinitionByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myAttributeName", targetNamespace = "http://www.sones.com")
        String myAttributeName);

    /**
     * 
     * @param myTransToken
     * @param myAttributeID
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns com.sones.ServiceAttributeDefinition
     */
    @WebMethod(operationName = "GetAttributeDefinitionByIDByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetAttributeDefinitionByIDByEdgeType")
    @WebResult(name = "GetAttributeDefinitionByIDByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetAttributeDefinitionByIDByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetAttributeDefinitionByIDByEdgeType")
    @ResponseWrapper(localName = "GetAttributeDefinitionByIDByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetAttributeDefinitionByIDByEdgeTypeResponse")
    public ServiceAttributeDefinition getAttributeDefinitionByIDByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myAttributeID", targetNamespace = "http://www.sones.com")
        Long myAttributeID);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myIncludeAncestorDefinitions
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "HasAttributesByEdgeType", action = "http://www.sones.com/EdgeTypeService/HasAttributesByEdgeType")
    @WebResult(name = "HasAttributesByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "HasAttributesByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.HasAttributesByEdgeType")
    @ResponseWrapper(localName = "HasAttributesByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.HasAttributesByEdgeTypeResponse")
    public Boolean hasAttributesByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myIncludeAncestorDefinitions", targetNamespace = "http://www.sones.com")
        Boolean myIncludeAncestorDefinitions);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myIncludeAncestorDefinitions
     * @return
     *     returns com.sones.ArrayOfServiceAttributeDefinition
     */
    @WebMethod(operationName = "GetAttributeDefinitionsByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetAttributeDefinitionsByEdgeType")
    @WebResult(name = "GetAttributeDefinitionsByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetAttributeDefinitionsByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetAttributeDefinitionsByEdgeType")
    @ResponseWrapper(localName = "GetAttributeDefinitionsByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetAttributeDefinitionsByEdgeTypeResponse")
    public ArrayOfServiceAttributeDefinition getAttributeDefinitionsByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myIncludeAncestorDefinitions", targetNamespace = "http://www.sones.com")
        Boolean myIncludeAncestorDefinitions);

    /**
     * 
     * @param myTransToken
     * @param myAttributeName
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "HasProprtyByEdgeType", action = "http://www.sones.com/EdgeTypeService/HasProprtyByEdgeType")
    @WebResult(name = "HasProprtyByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "HasProprtyByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.HasProprtyByEdgeType")
    @ResponseWrapper(localName = "HasProprtyByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.HasProprtyByEdgeTypeResponse")
    public Boolean hasProprtyByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myAttributeName", targetNamespace = "http://www.sones.com")
        String myAttributeName);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myPropertyName
     * @return
     *     returns com.sones.ServicePropertyDefinition
     */
    @WebMethod(operationName = "GetPropertyDefinitionByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetPropertyDefinitionByEdgeType")
    @WebResult(name = "GetPropertyDefinitionByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetPropertyDefinitionByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionByEdgeType")
    @ResponseWrapper(localName = "GetPropertyDefinitionByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionByEdgeTypeResponse")
    public ServicePropertyDefinition getPropertyDefinitionByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myPropertyName", targetNamespace = "http://www.sones.com")
        String myPropertyName);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myPropertyID
     * @return
     *     returns com.sones.ServicePropertyDefinition
     */
    @WebMethod(operationName = "GetPropertyDefinitionByIDByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetPropertyDefinitionByIDByEdgeType")
    @WebResult(name = "GetPropertyDefinitionByIDByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetPropertyDefinitionByIDByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionByIDByEdgeType")
    @ResponseWrapper(localName = "GetPropertyDefinitionByIDByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionByIDByEdgeTypeResponse")
    public ServicePropertyDefinition getPropertyDefinitionByIDByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myPropertyID", targetNamespace = "http://www.sones.com")
        Long myPropertyID);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myIncludeAncestorDefinitions
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "HasPropertiesByEdgeType", action = "http://www.sones.com/EdgeTypeService/HasPropertiesByEdgeType")
    @WebResult(name = "HasPropertiesByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "HasPropertiesByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.HasPropertiesByEdgeType")
    @ResponseWrapper(localName = "HasPropertiesByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.HasPropertiesByEdgeTypeResponse")
    public Boolean hasPropertiesByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myIncludeAncestorDefinitions", targetNamespace = "http://www.sones.com")
        Boolean myIncludeAncestorDefinitions);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myIncludeAncestorDefinitions
     * @return
     *     returns com.sones.ArrayOfServicePropertyDefinition
     */
    @WebMethod(operationName = "GetPropertyDefinitionsByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetPropertyDefinitionsByEdgeType")
    @WebResult(name = "GetPropertyDefinitionsByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetPropertyDefinitionsByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionsByEdgeType")
    @ResponseWrapper(localName = "GetPropertyDefinitionsByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionsByEdgeTypeResponse")
    public ArrayOfServicePropertyDefinition getPropertyDefinitionsByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myIncludeAncestorDefinitions", targetNamespace = "http://www.sones.com")
        Boolean myIncludeAncestorDefinitions);

    /**
     * 
     * @param myTransToken
     * @param mySecurityToken
     * @param myServiceEdgeType
     * @param myPropertyNames
     * @return
     *     returns com.sones.ArrayOfServicePropertyDefinition
     */
    @WebMethod(operationName = "GetPropertyDefinitionsByNameListByEdgeType", action = "http://www.sones.com/EdgeTypeService/GetPropertyDefinitionsByNameListByEdgeType")
    @WebResult(name = "GetPropertyDefinitionsByNameListByEdgeTypeResult", targetNamespace = "http://www.sones.com")
    @RequestWrapper(localName = "GetPropertyDefinitionsByNameListByEdgeType", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionsByNameListByEdgeType")
    @ResponseWrapper(localName = "GetPropertyDefinitionsByNameListByEdgeTypeResponse", targetNamespace = "http://www.sones.com", className = "com.sones.GetPropertyDefinitionsByNameListByEdgeTypeResponse")
    public ArrayOfServicePropertyDefinition getPropertyDefinitionsByNameListByEdgeType(
        @WebParam(name = "mySecurityToken", targetNamespace = "http://www.sones.com")
        ServiceSecurityToken mySecurityToken,
        @WebParam(name = "myTransToken", targetNamespace = "http://www.sones.com")
        Long myTransToken,
        @WebParam(name = "myServiceEdgeType", targetNamespace = "http://www.sones.com")
        ServiceEdgeType myServiceEdgeType,
        @WebParam(name = "myPropertyNames", targetNamespace = "http://www.sones.com")
        ArrayOfstring myPropertyNames);

}