package wmc.devops.spring.boot.reference.architecture;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import wmc.devops.spring.boot.reference.architecture.config.JavaConfig;
import wmc.devops.spring.boot.reference.architecture.ioc.ContactList;
import wmc.devops.spring.boot.reference.architecture.ioc.IContact;
import wmc.devops.spring.boot.reference.architecture.ioc.RegularContact;


// @ComponentScan("package name or prefix-name") - search in this package for components of the application.
// If I create a component in different package we cannot Autowired it
@SpringBootApplication
public class SpiringBootReferenceArchitectureApplication {

	private static ApplicationContext context; 

	public static void main(String[] args) {
		SpringApplication.run(SpiringBootReferenceArchitectureApplication.class, args);
		context = new AnnotationConfigApplicationContext(JavaConfig.class);
		IContact contact = (IContact) context.getBean("telemarketingContact");
		System.out.println(contact.callContact());

		ContactList contactList = (ContactList) context.getBean("contactList");
		System.out.println(contactList.getContacts());
		Iterator iter = contactList.getContacts().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}

}
