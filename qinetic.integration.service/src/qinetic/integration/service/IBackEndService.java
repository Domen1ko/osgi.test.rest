/**
 * 
 */
package qinetic.integration.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import qinetic.integration.models.RequestModel;
import qinetic.integration.models.ResponseModel;

/**
 * 	 This Interface is puplic api
 * @author Domeniko
 *
 */
@Path("/api")
public interface IBackEndService {
	
	/**
	 *  Example of perform call
	 * @param model
	 * @return
	 */
	public ResponseModel performCall(RequestModel model);
	
	/**
	 *  Example of retrieve data
	 * @param model
	 * @return
	 */
	public ResponseModel retriveData(RequestModel model);
	
	/**
	 *  Example of write data
	 * @param model
	 * @return
	 */
	public ResponseModel writeData(RequestModel model);
	
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test();
	

}
