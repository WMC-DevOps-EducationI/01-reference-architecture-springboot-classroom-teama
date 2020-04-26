package wmc.devops.spring.boot.reference.architecture.ioc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IoCDependencyInjectionUnitTest {

	@Test
	void testRegularContactCallingWithoutIoC() {
		RegularContact regularContactObject = new RegularContact("2322212");
		String contactNumber = regularContactObject.callContact();
		assert contactNumber.split("-")[1].equals("TEL");
	}
	
	@Test
	void testTelemarketingContactCallingWithoutIoC() {
		TelemarketingContact telemarketingContactObject = new TelemarketingContact("2322212123");
		String contactNumber = telemarketingContactObject.callContact();
		assert contactNumber.split("-")[1].equals("CEL");
	}
	
	/**
	 * Test the dependency injection principle of using IContact interface
	 * implemented by different types of Contacts.
	 */
	@Test
	void testDifferentiateContactCallingWithIoC() {
		IoCBean iOCBean = new IoCBean(new TelemarketingContact("2322212123"));
		IoCBean iOCBeanII = new IoCBean(new RegularContact("2322214"));
		assert iOCBean.callContact().split("-")[1].equals("CEL");
		assert iOCBeanII.callContact().split("-")[1].equals("TEL");
	}

}
