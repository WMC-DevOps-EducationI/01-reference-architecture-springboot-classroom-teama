/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.ioc;

/**
 * @author wchavez
 *
 */
public interface IContact {

	/**
	 * Call the contact using the associated phone.
	 * @return  the associated phone and its type (CEL or TEL).
	 */
	public String callContact();
	
}
