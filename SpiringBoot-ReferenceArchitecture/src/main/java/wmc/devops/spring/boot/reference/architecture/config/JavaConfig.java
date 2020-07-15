/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import wmc.devops.spring.boot.reference.architecture.ioc.IContact;
import wmc.devops.spring.boot.reference.architecture.ioc.RegularContact;
import wmc.devops.spring.boot.reference.architecture.ioc.TelemarketingContact;

/**
 * @author wchavez
 *
 */
@Configuration
@Import(JavaConfigSetterInjection.class) 
public class JavaConfig {

	@Bean
	public RegularContact regularContact() {
		String fixedPhone = "";
		RegularContact regularContact = new RegularContact(fixedPhone);
		return regularContact;
	}
	
	@Bean
	public TelemarketingContact telemarketingContact() {
		String cellPhone = "";
		TelemarketingContact telemarketingContact = new TelemarketingContact(cellPhone);
		return telemarketingContact;
	}
	
}
