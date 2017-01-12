/**
 * 
 */
package qinetic.business.rest.api.services.dto;

import java.io.Serializable;

/**
 * @author Domeniko
 *
 */
public class ResponseDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @return the esito
	 */
	public String getEsito() {
		return esito;
	}
	/**
	 * @param esito the esito to set
	 */
	public void setEsito(String esito) {
		this.esito = esito;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the payLoad
	 */
	public String getPayLoad() {
		return payLoad;
	}
	/**
	 * @param payLoad the payLoad to set
	 */
	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
	}
	
	private String esito;
	private String message;
	private String payLoad;

}
