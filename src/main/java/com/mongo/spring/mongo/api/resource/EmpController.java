package com.mongo.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.spring.mongo.api.model.Employee;
import com.mongo.spring.mongo.api.repository.EmpRepository;


@RestController
@RequestMapping("/api")
public class EmpController {

	@Autowired
	private EmpRepository emprep;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> saveEmp(@RequestBody Employee emp)
	{
		emprep.save(emp);
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmp()
	{
		return emprep.findAll();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmp_byid(@PathVariable int id)
	{
		return emprep.findById(id);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String delete(@PathVariable int id)
	{
		emprep.deleteById(id);
		return "Employee with id: "+id+" deleted successfully!";
	}
}
