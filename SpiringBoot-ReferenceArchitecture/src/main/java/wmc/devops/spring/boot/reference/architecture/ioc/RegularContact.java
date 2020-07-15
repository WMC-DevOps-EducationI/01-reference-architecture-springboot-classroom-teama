/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.ioc;

/**
 * @author wchavez
 *
 */
public class RegularContact implements IContact{

	private String fixedPhone;
	
	/**
	 * 
	 */
	public RegularContact(String fixedPhone) {
		this.fixedPhone = fixedPhone; 
	}

	@Override
	public String callContact() {
		return fixedPhone + "-TEL";
	}

	public String toString() {
		return "Regular: " + fixedPhone;
	}
	
}
