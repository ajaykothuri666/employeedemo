package com.ajay.project.employeedemo;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployeedemoApplication implements CommandLineRunner {
	
	@Autowired //to connect EmpRepository and EmployeeApplication
	EmployeedemoService empService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Employeedemo emp1 = new Employeedemo("Arjun","1998-08-09","2020-09-27",80000.00,"Arjun@abc.com",1);
		Employeedemo emp2 = new Employeedemo("Vijay","1999-04-08","2020-09-29",80000.00,"Vijay@abc.com",2);
		
		empService.emp.addAll(Arrays.asList(emp1,emp2));
		
	}
	
	
	
	
	
}
