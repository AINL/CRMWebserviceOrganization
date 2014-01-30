/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.organization;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import nl.amnesty.crm.entity.Organization;

/**
 *
 * @author bmenting
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */
@WebService()
@Stateless()
public class OrganizationCRUD {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public long create(
            @WebParam(name = "Name") String name) {
        //TODO write your implementation code here:
        long organizationid = 123456789;
        return organizationid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "read")
    public Organization read(long organizationid) {
        //TOrDO write your implementation code here:
        Organization organization = new Organization();
        organization.setName("Name");
        return organization;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public long update(@WebParam(name = "Organizationid") long organizationid,
            @WebParam(name = "Name") String name) {
        //TODO write your implementation code here:
        return organizationid;
    }
    */

    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public long delete(@WebParam(name = "Organizationid") long organizationid) {
        //TODO write your implementation code here:
        return organizationid;
    }
    */
}

