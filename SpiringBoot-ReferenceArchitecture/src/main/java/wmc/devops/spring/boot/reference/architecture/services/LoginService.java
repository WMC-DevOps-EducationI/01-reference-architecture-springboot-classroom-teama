/**
 * 
 */
package wmc.devops.spring.boot.reference.architecture.services;

import org.springframework.stereotype.Component;

/**
 * @author William Martín Chávez González
 * Reference: https://github.com/in28minutes/full-stack-with-angular-and-spring-boot
 */
// SpringBean - // @Service or @Controller or @Repository
// @Service - business logic.
// @Controller - MVC Framework.
// @Repository -  DAOs.
@Component
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("wmc") && password.equalsIgnoreCase("pass");
	}
	
}
