# ci-java-technologies
Continuous Integration with Java

## Objectives

1. Learn and describe the Spring Boot reference architecture to developing Enterprise Applications.
2. Make a resume presentation about the Architectural principles and components.
3. Develop a custom spring boot basic application identifying the principles and components related to objective 2. 

**NOTE**: include a Travis CI integration in GitHub Education with Google Classrooms and Eclipse with Spring Boot 4. In order to evaluate the process, please review GitHub Education assigment repository and its related Travis CI testing execution results.

## 1) SpringBoot Reference Architectural Principles:

<details>
  <summary>IoC-Dependency Injection</summary>
  
A) **Inversion of Control (IoC) and Dependency Injection principle**:

**Package name in SpringBoot project**: *package wmc.devops.spring.boot.reference.architecture.ioc;*.

This principle describes how Spring Framework leads with the high coupling of objects in a Java application when those are invoked from other objects in a direct invocation.

For example, in the context of a Contact Center, if you have a class called **OutboundCampaing**, other called **ContactList**, other called  **TelemarketingContact**, and other called **RegularContact**; and in this Contact Center, the campaigns call only the cellphone of Telemarketing contacts and the telephone of Regular Contacts, so, in order to create the related objects of a functional outbound campaign you should do the following:
 * First a *telemarketingContactObject* must be created:
    ```
        TelemarketingContact telemarketingContactObject = new TelemarketingContact(...);
		String contactNumber = telemarketingContactObject.callContact();
        // The type of the contact number must be: "CEL".
        
    ```
 * Then a *regularContactObject* must be created:
    ```
        RegularContact regularContactObject = new RegularContact(...);
		String contactNumber = regularContactObject.callContact();
        // The type of the contact number must be: "TEL".

    ```
 * But how can we differentiate between the calling of a RegularContact or a TelemarketingContact?
    
    * By using a Java Interface called *IContact* that should be implemented by both the *RegularContact class* and the *TelemarketingContact class*:

        ```
         public class RegularContact implements IContact
         public class TelemarketingContact implements IContact
        ```
    * Then implementing each *callContact()* behavior:
        ```
          // RegularContact class:
          @Override
	        public String callContact() {
		    return fixedPhone + "-TEL";
	      }
          
          // TelemarketingContact class:
          @Override
	      public String callContact() {
		    return cellPhone + "-CEL";
	      }
        ```

    * Finally, by creating an Bean (*IoCBean class*) that **INJECTS** in its constructor class method the *IContact interface*, in order for  **INJECT** either a *TelemarketingContact object* or a *RegularContact object*. This allows the application to create a Bean instance and to **INJECT** it a contact:
        ```
         /**The Bean´s constructor method
	      * Note that the contact is INJECTED.
	      **/
	    public IoCBean(IContact contact) {
		    this.contact = contact;
	    }
        ```
 * Please run `mvn test` command in order for check the IoCDependencyInjectionUnitTest example implementation.
  
</details>




## References 

1. [Spring Boot - Tutorial](https://www.educba.com/category/software-development/software-development-tutorials/spring-tutorial/).
2. [Spring Boot reference architecture](https://www.educba.com/spring-boot-architecture/).
3. [Spring Boot - documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/).
4. [Reveal.js - Make presentations using HTML](https://github.com/hakimel/reveal.js).
5. [Travis CI - Introduction](https://travis-ci.org/). 
6. [Travis CI - Integrationa dn Importing Shared Build Configuration](https://docs.travis-ci.com/user/build-config-imports/).
7. [Travis CI - Integrationa dn Importing Shared Build Configuration-2](https://stackoverflow.com/questions/14006810/how-do-i-get-travis-build-working-directory-in-travis-yml).
8. [Travis CI - Integrationa dn Importing Shared Build Configuration-3](https://github.com/numenta/nupic.core/blob/master/.travis.yml/).
9. [Travis CI - Integrationa dn Importing Shared Build Configuration-4](https://stackoverflow.com/questions/48129400/travis-ci-build-failing-because-my-project-is-one-level-down-from-the-git-reposi).
10. [Travis CI - Integrationa dn Importing Shared Build Configuration-4](https://docs.travis-ci.com/user/job-lifecycle/).
11. [GitHub Actions Integration using different directory](https://stackoverflow.com/questions/58139175/running-actions-in-another-directory).

