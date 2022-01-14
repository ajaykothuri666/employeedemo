package com.ajay.project.employeedemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class EmployeedemoService {
	public List<Employeedemo>emp=new ArrayList<Employeedemo>();

	
	public List<Employeedemo> getAll() {
		
		return emp;
	}
	
	
	
	public String add(Employeedemo newEmp)
	{
		emp.add(newEmp);
		return "added";
		
	}



	public String edit(Employeedemo newEmp) {
		emp.stream().filter(e->e.getEmployeeid()== newEmp.getEmployeeid()).forEach(e->{
			e.setName(newEmp.getName());
			
		});
		return "edited";
		
	}



	public String delete(int employeeid) {
		emp.remove(employeeid-1);
		return "Deleted";
	}
	
	
	
	
	

	


	
}
	
	

	


