package com.ajay.project.employeedemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeedemoController {
	@Autowired
	EmployeedemoService empService;
	
	
	@GetMapping("/all")
	public List<Employeedemo> getAll()
	{
		return empService.getAll();
	}
	
	
	@PostMapping("/add")
	public String add(@RequestBody Employeedemo empdemo)
	{
		return empService.add(empdemo);
	}
	
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int employeeid)
	{
		return empService.delete(employeeid);
	}
	
	
	
	@PutMapping("/edit")
	public String edit(@RequestBody Employeedemo newEmp)
	{
		return empService.edit(newEmp);
	}
	
	
	


}
