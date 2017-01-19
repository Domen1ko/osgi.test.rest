package qinetic.ace.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import qinetic.integration.models.RequestModel;
import qinetic.integration.service.IBackEndService;
import qinetic.integration.service.provider.BackEndServiceImpl;

@Path("api")
public class ResourceRS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("test")
	public String test(){
		IBackEndService service = new BackEndServiceImpl();
		RequestModel req = new RequestModel();
		req.setKey("key");
		req.setPayLoad("payload");
		return service.retriveData(req).getResultCode();
					
	};
}
