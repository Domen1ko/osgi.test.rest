/**
 * 
 */
package qinetic.business.rest.api.internal.service;

import javax.naming.InitialContext;
import javax.ws.rs.Path;

import qinetic.business.rest.api.internal.trasformer.Trasformer;
import qinetic.business.rest.api.services.IBackEndRS;
import qinetic.business.rest.api.services.dto.RequestDTO;
import qinetic.business.rest.api.services.dto.ResponseDTO;
import qinetic.integration.models.RequestModel;
import qinetic.integration.service.IBackEndService;

/**
 * @author Domeniko
 *
 */
@Path("/api")
public class BackEndRS implements IBackEndRS {
	
	
	private IBackEndService service;

	/* (non-Javadoc)
	 * @see qinetic.business.rest.api.services.IBackEndRS#performCall(java.lang.String)
	 */
	public String performCall(String key) {
		RequestModel model = new RequestModel();
		model.setKey(key);
		model.setPayLoad("<< >>");
		if(service == null){
			try {
				service = (IBackEndService) new InitialContext().lookup("osgi:service/"+IBackEndService.class.getName());
			} catch (Exception e) {
				e.printStackTrace();
		}
		}
		return service.performCall(model).getResultCode();
	}

	/* (non-Javadoc)
	 * @see qinetic.business.rest.api.services.IBackEndRS#performCall(qinetic.business.rest.api.services.dto.RequestDTO)
	 */
	public String writeData(RequestDTO model) {
		if(service == null){
			try {
				service = (IBackEndService) new InitialContext().lookup("osgi:service/"+IBackEndService.class.getName());
			} catch (Exception e) {
				e.printStackTrace();
		}}
		return service.writeData(Trasformer.trasformDto(model)).getMessage();
	}

	/* (non-Javadoc)
	 * @see qinetic.business.rest.api.services.IBackEndRS#read(java.lang.String)
	 */
	public ResponseDTO read(String key) {
		RequestModel model = new RequestModel();
		model.setKey(key);
		model.setPayLoad("<< >>");
		if(service == null){
			try {
				service = (IBackEndService) new InitialContext().lookup("osgi:service/"+IBackEndService.class.getName());
			} catch (Exception e) {
				e.printStackTrace();
		}}
		return Trasformer.trasformDtoToModel(service.retriveData(model));
	}

	public String sayHello(){
		return "ciao";
	}
}
