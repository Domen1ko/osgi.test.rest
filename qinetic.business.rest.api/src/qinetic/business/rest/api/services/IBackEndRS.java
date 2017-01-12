/**
 * 
 */
package qinetic.business.rest.api.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import qinetic.business.rest.api.services.dto.RequestDTO;
import qinetic.business.rest.api.services.dto.ResponseDTO;

/**
 * @author Domeniko
 *
 */

@Path("/api")
public interface IBackEndRS {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{key}")
	public String performCall(@PathParam("key") String key);
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/write")
	public String writeData(RequestDTO model);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/read/{key}")
	public ResponseDTO read(@PathParam("key") String key);
	
	@GET
	@Path("/ciao")
	public String sayHello();
}
