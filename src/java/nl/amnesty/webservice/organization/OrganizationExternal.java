/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.amnesty.webservice.organization;

/**
 *
 * @author bmenting
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import nl.amnesty.crm.persistence.EMOrganization;


@WebService()
@Stateless()
public class OrganizationExternal {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getorganizationnameviarole")
    public String getorganisationnameviarole(@WebParam(name = "Roleid") long roleid) {
        try {
            EMOrganization em = new EMOrganization();
            Logger.getLogger(OrganizationExternal.class.getName()).log(Level.INFO, "OrganizationExternal: getdebtornumberviaaiorganizationmember");
            String organizationName = em.roleReadOrganizationNameViaRoleid(roleid);
                       
            return organizationName;
        } catch (Exception e) {
            Logger.getLogger(OrganizationExternal.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
     @WebMethod(operationName = "getaigroupnameviarole")
    public String getaigroupnameviarole(@WebParam(name = "Roleid") long roleid) {
        try {
            EMOrganization em = new EMOrganization();
            Logger.getLogger(OrganizationExternal.class.getName()).log(Level.INFO, "OrganizationExternal: getdebtornumberviaaiorganizationmember");
            String groupName = em.roleReadAIGroupNameViaRoleid(roleid);
                       
            return groupName;
        } catch (Exception e) {
            Logger.getLogger(OrganizationExternal.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}

