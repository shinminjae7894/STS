package com.mysite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/emp")
	public String insertEmployee(@RequestBody Employee emp) {
		employeeService.insertEmployee(emp);
		return "잘 저장되었습니다.";
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
		return "잘 삭제되었습니다";
	}
	
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable("id") int id, @RequestBody Employee emp) {
		String result = String.valueOf(id) + "," + emp;
		return result;
	}
}