/**
 * 
 */
package fr.vbt.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/**
 * Provide additional methods to get existing/valueded string keys and
 * values.<br>
 * Throws {@link RuntimeException} if keys or values are not String type.<br>
 * 
 * @author Valère Bertin - iohack11@gmail.com
 * @since 1.6
 * @version 1.0
 */
public class StringsProperties extends Properties {

	/**
	 * ID.
	 */
	private static final long serialVersionUID = -1476721779034541735L;

	/**
	 * Returns an array of all string keys.
	 *
	 * @return Key Strings array.
	 */
	public String[] getStringKeys() {
		Enumeration<Object> keysEnumeration = keys();
		List<String> keyStrings = new ArrayList<>();

		while (keysEnumeration.hasMoreElements()) {
			Object key = keysEnumeration.nextElement();
			if (key instanceof String) {
				keyStrings.add((String) key);
			} else {
				throw new RuntimeException("Key is not a String instance.");
			}
		}
		return keyStrings.toArray(new String[0]);
	}
}
