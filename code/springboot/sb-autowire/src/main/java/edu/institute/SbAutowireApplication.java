package edu.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.institute.controller.UserController;

@SpringBootApplication
public class SbAutowireApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbAutowireApplication.class, args);
		
		UserController controller = ctx.getBean(UserController.class); // get the object of class available inside spring container
		controller.saveUser();
	}

}
