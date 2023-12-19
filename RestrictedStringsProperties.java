/**
 * 
 */
package fr.vbt.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Restricted string porperties.<br>
 * Adding needed keys, needed values and not empty values.
 * 
 * @author Valère Bertin - iohack11@gmail.com
 * @since 1.6
 * @version 0.1 
 */ 
 //TODO  
 
public class RestrictedStringsProperties extends StringsProperties implements Serializable {

	/**
	 * ID.
	 */
	public static final long serialVersionUID = 520429596588644051L;
	
	/**
	 * Needed keys. 
	 */
	private List<String> neededKeys = new ArrayList<String>();
		
	/**
	 * Needed keyValue;
	 */
	private List<String> neededKeyValue = new ArrayList<String>();
	
	/**
	 * Needed not empty key value;
	 */
	private List<String> neededNotEmptyKeyValue = new ArrayList<String>();

	public List<String> getNeededKeys() {
		return neededKeys;
	}

	public void setNeededKeys(List<String> neededKeys) {
		this.neededKeys = neededKeys;
		
	}

	public List<String> getNeededKeyValue() {
		return neededKeyValue;
	}

	public void setNeededKeyValue(List<String> neededKeyValue) {
		this.neededKeyValue = neededKeyValue;
	}

	public List<String> getNeededNotEmptyValue() {
		return neededNotEmptyKeyValue;
	}

	public void setNeededNotEmptyValue(List<String> neededNotEmptyValue) {
		this.neededNotEmptyKeyValue = neededNotEmptyValue;
	}
}
