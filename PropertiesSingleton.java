/**
 * 
 */
package fr.vbt.utils;

import java.util.Properties;

/**
 * Define a properties singleton.<br>
 * That means that for an application, only one instance is accessible with the
 * {@link PropertiesSingleton PropertiesSingleton.getInstance()} method.<br>
 * Usefull concept to avoid duplicate application {@link Properties} instances
 * having few changes during the application processing life.
 *
 * @author Valère Bertin
 * @version 1.0
 * @since 1.6
 * 
 */
public class PropertiesSingleton extends Properties {

	/**
	 * ID.
	 */
	private static final long serialVersionUID = -2609241717142447885L;
	
	/**
	 * The properties singleton.
	 */
	private static PropertiesSingleton propertiesSingleton = null;
	
	/**
	 * Uniq private constructor to prevent this class user creating more than
	 * one {@link PropertiesSingleton} instances.
	 */
	private PropertiesSingleton() {
		propertiesSingleton = new PropertiesSingleton();	
	}
	
	/**
	 * Uniq way to obtain a unic instance of {@link PropertiesSingleton}.
	 * @return Unic instance of {@link PropertiesSingleton}.
	 */
	public PropertiesSingleton getInstance() {
		if(propertiesSingleton == null) {
			propertiesSingleton = new PropertiesSingleton();
		}
		return propertiesSingleton;
	}
}
