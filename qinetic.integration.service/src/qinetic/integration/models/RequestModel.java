/**
 * 
 */
package qinetic.integration.models;

/**
 * 	 Model for input
 * @author Domeniko
 *
 */
public class RequestModel {
	
	private String payLoad;
	private String key;
	
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
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

}
