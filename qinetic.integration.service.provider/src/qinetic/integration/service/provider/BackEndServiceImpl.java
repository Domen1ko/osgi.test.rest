/**
 * 
 */
package qinetic.integration.service.provider;

import qinetic.integration.models.RequestModel;
import qinetic.integration.models.ResponseModel;
import qinetic.integration.service.IBackEndService;

/**
 * 	 Implementation of service present in bundle qinetic.integration.service
 * @author Domeniko
 *
 */
public class BackEndServiceImpl implements IBackEndService{
	

	@Override
	public ResponseModel performCall(RequestModel model) {
		ResponseModel response = new ResponseModel();
		if(model.getKey() != null && model.getPayLoad() != null){
			response.setResultCode(ResponseModel.RESULT_CODE.OK);
			response.setMessage(" Successfull call at perform call. Actual version 0.1");
		}else{
			response.setResultCode(ResponseModel.RESULT_CODE.KO);
			response.setMessage("UnSuccessfull call at perform call. Maybe missing mandatory parameter? Actual version 0.1");
		}
		return response;
	}

	@Override
	public ResponseModel retriveData(RequestModel model) {
		ResponseModel response = new ResponseModel();
		if(model.getKey() != null && model.getPayLoad() != null){
			response.setResultCode(ResponseModel.RESULT_CODE.OK);
			response.setMessage("Successfull call at retrieve data. Actual version 0.1");
			response.setPayLoad("some JSON here");
		}else{
			response.setResultCode(ResponseModel.RESULT_CODE.KO);
			response.setMessage("UnSuccessfull call at perform call. Maybe missing mandatory parameter? Actual version 0.1");
		}
		return response;
	}

	@Override
	public ResponseModel writeData(RequestModel model) {
		ResponseModel response = new ResponseModel();
		if(model.getKey() != null && model.getPayLoad() != null){
			response.setResultCode(ResponseModel.RESULT_CODE.OK);
			response.setMessage(" Successfull call at write data. Actual version 0.1");
		}else{
			response.setResultCode(ResponseModel.RESULT_CODE.KO);
			response.setMessage("UnSuccessfull call at write data. Maybe missing mandatory parameter? Actual version 0.1");
		}
		return response;
	}

	@Override
	public String test() {
		return "successs";
	}

}
