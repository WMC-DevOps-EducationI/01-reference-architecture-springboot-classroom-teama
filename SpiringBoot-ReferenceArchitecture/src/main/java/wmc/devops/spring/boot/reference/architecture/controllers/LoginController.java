package wmc.devops.spring.boot.reference.architecture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wmc.devops.spring.boot.reference.architecture.services.LoginService;

// /login => "Hello World"
@Controller 
public class LoginController {

	// Model: is a dependency of the LoginController
	// Applies the concept of the Dependency Injection
	// Applies Autowiring:
	// Injected automatically
	@Autowired // When you find in the context a LoginService created give it to me in order to use it.
	LoginService service;

	public LoginController() {
		
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET) // GET, POST, all
//	@ResponseBody
	public String showLoginMessage(
//			@RequestParam String name, 
			ModelMap model) {
//		model.put("name", name);
		return "login";
	}

	@RequestMapping("/login/custom")
	public String custom(@RequestParam int number, ModelMap model) {
		model.put("number", number);
		return "custom";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@ResponseBody
	public String showWelcomeMessage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (service.validateUser(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		} else {
			model.put("errorMessage","Invalid Credentials");
			return "login";
		}

	}

}
