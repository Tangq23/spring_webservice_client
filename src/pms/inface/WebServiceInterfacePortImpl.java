
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package pms.inface;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-06-07T11:52:27.819+08:00
 * Generated source version: 3.3.2
 *
 */

@javax.jws.WebService(
                      serviceName = "WebServiceInterfaceService",
                      portName = "WebServiceInterfacePort",
                      targetNamespace = "http://spring.webservice.server",
                      wsdlLocation = "http://localhost:8080/spring_webservice_server/webservice/webServiceInterface?wsdl",
                      endpointInterface = "pms.inface.WebServiceInterface")

public class WebServiceInterfacePortImpl implements WebServiceInterface {

    private static final Logger LOG = Logger.getLogger(WebServiceInterfacePortImpl.class.getName());

    /* (non-Javadoc)
     * @see pms.inface.WebServiceInterface#sayBye(java.lang.String word)*
     */
    public java.lang.String sayBye(java.lang.String word) {
        LOG.info("Executing operation sayBye");
        System.out.println(word);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
