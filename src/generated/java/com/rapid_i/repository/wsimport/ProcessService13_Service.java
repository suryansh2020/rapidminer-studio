/**
 * Copyright (C) 2001-2015 by RapidMiner and the contributors
 *
 * Complete list of developers available at our web site:
 *
 *      http://rapidminer.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package com.rapid_i.repository.wsimport;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProcessService_1_3", targetNamespace = "http://service.web.rapidanalytics.de/", wsdlLocation = "http://localhost:8080/RAWS/ProcessService_1_3?wsdl")
public class ProcessService13_Service
    extends Service
{

    private final static URL PROCESSSERVICE13_WSDL_LOCATION;
    private final static WebServiceException PROCESSSERVICE13_EXCEPTION;
    private final static QName PROCESSSERVICE13_QNAME = new QName("http://service.web.rapidanalytics.de/", "ProcessService_1_3");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RAWS/ProcessService_1_3?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROCESSSERVICE13_WSDL_LOCATION = url;
        PROCESSSERVICE13_EXCEPTION = e;
    }

    public ProcessService13_Service() {
        super(__getWsdlLocation(), PROCESSSERVICE13_QNAME);
    }

    public ProcessService13_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROCESSSERVICE13_QNAME, features);
    }

    public ProcessService13_Service(URL wsdlLocation) {
        super(wsdlLocation, PROCESSSERVICE13_QNAME);
    }

    public ProcessService13_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROCESSSERVICE13_QNAME, features);
    }

    public ProcessService13_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProcessService13_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProcessService13
     */
    @WebEndpoint(name = "ProcessService_1_3Port")
    public ProcessService13 getProcessService13Port() {
        return super.getPort(new QName("http://service.web.rapidanalytics.de/", "ProcessService_1_3Port"), ProcessService13.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProcessService13
     */
    @WebEndpoint(name = "ProcessService_1_3Port")
    public ProcessService13 getProcessService13Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.web.rapidanalytics.de/", "ProcessService_1_3Port"), ProcessService13.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROCESSSERVICE13_EXCEPTION!= null) {
            throw PROCESSSERVICE13_EXCEPTION;
        }
        return PROCESSSERVICE13_WSDL_LOCATION;
    }

}
