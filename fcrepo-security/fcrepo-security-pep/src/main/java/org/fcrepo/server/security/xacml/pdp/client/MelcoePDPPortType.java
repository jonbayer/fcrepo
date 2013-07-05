package org.fcrepo.server.security.xacml.pdp.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-08-01T16:22:54.488+02:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://pdp.xacml.melcoe", name = "MelcoePDPPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface MelcoePDPPortType {

    @WebResult(name = "return", targetNamespace = "http://pdp.xacml.melcoe/xsd")
    @Action(input = "urn:evaluate", fault = {})
    @RequestWrapper(localName = "evaluate", targetNamespace = "http://pdp.xacml.melcoe/xsd", className = "org.fcrepo.server.security.xacml.pdp.client.Evaluate")
    @WebMethod(action = "urn:evaluate")
    @ResponseWrapper(localName = "evaluateResponse", targetNamespace = "http://pdp.xacml.melcoe/xsd", className = "org.fcrepo.server.security.xacml.pdp.client.EvaluateResponse")
    public java.lang.String evaluate(
        @WebParam(name = "param0", targetNamespace = "http://pdp.xacml.melcoe/xsd")
        java.lang.String param0
    ) throws EvaluateFault_Exception;

    @WebResult(name = "return", targetNamespace = "http://pdp.xacml.melcoe/xsd")
    @Action(input = "urn:evaluateBatch", fault = {})
    @RequestWrapper(localName = "evaluateBatch", targetNamespace = "http://pdp.xacml.melcoe/xsd", className = "org.fcrepo.server.security.xacml.pdp.client.EvaluateBatch")
    @WebMethod(action = "urn:evaluateBatch")
    @ResponseWrapper(localName = "evaluateBatchResponse", targetNamespace = "http://pdp.xacml.melcoe/xsd", className = "org.fcrepo.server.security.xacml.pdp.client.EvaluateBatchResponse")
    public java.lang.String evaluateBatch(
        @WebParam(name = "param0", targetNamespace = "http://pdp.xacml.melcoe/xsd")
        java.util.List<java.lang.String> param0
    ) throws EvaluateBatchFault_Exception;
}