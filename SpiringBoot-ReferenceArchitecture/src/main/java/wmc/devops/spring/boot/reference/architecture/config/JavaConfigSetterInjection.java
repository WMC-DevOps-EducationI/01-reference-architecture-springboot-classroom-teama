/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import wmc.devops.spring.boot.reference.architecture.ioc.ContactList;
import wmc.devops.spring.boot.reference.architecture.ioc.IContact;
import wmc.devops.spring.boot.reference.architecture.ioc.RegularContact;
import wmc.devops.spring.boot.reference.architecture.ioc.TelemarketingContact;

/**
 * @author wchavez
 *
 */
@Configuration
public class JavaConfigSetterInjection {

	@Bean
	public ContactList contactList() {
		List<IContact> contacts = new ArrayList<IContact>();
		ContactList contactList = new ContactList();
		IContact contact = new RegularContact("3339031");
		contacts.add(contact);
		IContact contact2 = new TelemarketingContact("3183476404");
		contacts.add(contact2);
		contactList.setIContacts(contacts); 
		return contactList;
	}

}
