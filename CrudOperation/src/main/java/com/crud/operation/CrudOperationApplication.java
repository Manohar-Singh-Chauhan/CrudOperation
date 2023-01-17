package com.crud.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crud.operation.entities.User;
import com.crud.operation.repositry.UserRepo;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		 ApplicationContext context =SpringApplication.run(CrudOperationApplication.class, args);
		 
	UserRepo userRepo	= context.getBean(UserRepo.class);
	
	// create 
	User user = new User();
	user.setName("Rahul");
	user.setCity("kanpur");
	
	userRepo.save(user);
	}

}
