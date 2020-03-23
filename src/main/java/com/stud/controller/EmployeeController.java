package com.stud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stud.dao.EmployeeDao;
import com.stud.modle.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	@PostMapping("/employees")
	public Employee createEmployee( @Valid @RequestBody Employee emp){
		System.out.println("employee is saved : "+emp);
		return employeeDao.employeeSave(emp);
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
    return employeeDao.findAll();
    
	}
	
	@GetMapping("employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long empid)
	{
				Employee emp=employeeDao.getOne(empid);
			
		if(empid==null){
			
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
	
	@PutMapping("employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long id, @Valid @RequestBody Employee empDetials){
		Employee emp=employeeDao.getOne(id);
		
		if (id == null) {
			
			return ResponseEntity.notFound().build();
		}
		
		emp.setId(empDetials.getId());
		emp.setName(empDetials.getName());
		emp.setEmailId(empDetials.getEmailId());
		
		Employee updateEmployee=employeeDao.save(emp);
		return ResponseEntity.ok().body(emp);
	}
	
	
	@DeleteMapping("employees/{id}")
	public ResponseEntity<Employee> DeleteEmployee(@PathVariable(value="id") Long id){
		Employee emp=employeeDao.getOne(id);
		
		if (id == null) {
			
			return ResponseEntity.notFound().build();
		}
		
	
		employeeDao.delete(emp);
		return ResponseEntity.ok().body(emp);
	}
	
	
}
