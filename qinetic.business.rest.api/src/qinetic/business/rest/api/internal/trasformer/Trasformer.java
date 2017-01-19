/**
 * 
 */
package qinetic.business.rest.api.internal.trasformer;

import qinetic.business.rest.api.services.dto.RequestDTO;
import qinetic.business.rest.api.services.dto.ResponseDTO;
import qinetic.integration.models.RequestModel;
import qinetic.integration.models.ResponseModel;

/**
 * @author Domeniko
 *
 */
public class Trasformer {
	
	/**
	 *  Convert Dto into model
	 * @param dto
	 * @return
	 */
	public static RequestModel trasformDto(RequestDTO dto){
		RequestModel model = new RequestModel();
		model.setKey(dto.getKey());
		model.setPayLoad(dto.getPayLoad());
		return model;
	}

	/**
	 * @param retriveData
	 * @return
	 */
	public static ResponseDTO trasformDtoToModel(ResponseModel data) {
		ResponseDTO dto = new ResponseDTO();
		dto.setEsito(data.getResultCode());
		dto.setMessage(data.getMessage());
		dto.setPayLoad(data.getPayLoad());
		return dto;
	}

}
