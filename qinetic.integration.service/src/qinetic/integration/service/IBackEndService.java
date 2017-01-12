/**
 * 
 */
package qinetic.integration.service;

import qinetic.integration.models.RequestModel;
import qinetic.integration.models.ResponseModel;

/**
 * 	 This Interface is puplic api
 * @author Domeniko
 *
 */
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

}
