/**
 * 
 */
package qinetic.integration.models;

/**
 * 	Basic Response Model
 * @author Domeniko
 *
 */
public class ResponseModel {
	
	
	public enum RESULT_CODE{
		OK,
		KO
	}
	
	private String resultCode;
	private String message;
	private String payLoad;
	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}
	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * 	 Set result by defualt enum
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(RESULT_CODE code) {
		this.resultCode = code.toString();
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
	

}
