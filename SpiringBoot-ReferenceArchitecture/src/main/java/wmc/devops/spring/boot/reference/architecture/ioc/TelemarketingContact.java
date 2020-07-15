/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.ioc;

/**
 * @author wchavez
 *
 */
public class TelemarketingContact implements IContact{

	private String cellPhone;
	
	public TelemarketingContact(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String callContact() {
		return cellPhone + "-CEL";
	}

	public String toString() {
		return "Telemarketing: " + cellPhone;
	}
	
}
