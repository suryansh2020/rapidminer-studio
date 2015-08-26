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
@WebServiceClient(name = "RepositoryService", targetNamespace = "http://service.web.rapidanalytics.de/", wsdlLocation = "http://localhost:8080/RAWS/RepositoryService?wsdl")
public class RepositoryService_Service
    extends Service
{

    private final static URL REPOSITORYSERVICE_WSDL_LOCATION;
    private final static WebServiceException REPOSITORYSERVICE_EXCEPTION;
    private final static QName REPOSITORYSERVICE_QNAME = new QName("http://service.web.rapidanalytics.de/", "RepositoryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RAWS/RepositoryService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPOSITORYSERVICE_WSDL_LOCATION = url;
        REPOSITORYSERVICE_EXCEPTION = e;
    }

    public RepositoryService_Service() {
        super(__getWsdlLocation(), REPOSITORYSERVICE_QNAME);
    }

    public RepositoryService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), REPOSITORYSERVICE_QNAME, features);
    }

    public RepositoryService_Service(URL wsdlLocation) {
        super(wsdlLocation, REPOSITORYSERVICE_QNAME);
    }

    public RepositoryService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REPOSITORYSERVICE_QNAME, features);
    }

    public RepositoryService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RepositoryService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RepositoryService
     */
    @WebEndpoint(name = "RepositoryServicePort")
    public RepositoryService getRepositoryServicePort() {
        return super.getPort(new QName("http://service.web.rapidanalytics.de/", "RepositoryServicePort"), RepositoryService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RepositoryService
     */
    @WebEndpoint(name = "RepositoryServicePort")
    public RepositoryService getRepositoryServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.web.rapidanalytics.de/", "RepositoryServicePort"), RepositoryService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPOSITORYSERVICE_EXCEPTION!= null) {
            throw REPOSITORYSERVICE_EXCEPTION;
        }
        return REPOSITORYSERVICE_WSDL_LOCATION;
    }

}
