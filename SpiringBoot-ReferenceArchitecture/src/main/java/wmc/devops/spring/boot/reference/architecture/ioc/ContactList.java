/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.ioc;

import java.util.List;

/**
 * @author wchavez
 *
 */
public class ContactList {

	private List<IContact> contacts;
	
	public ContactList() {

	}

	public void setIContacts(List<IContact> contacts) {
		this.contacts = contacts;
	}

	public List<IContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<IContact> contacts) {
		this.contacts = contacts;
	}
	
	
	
}
