package com.example.StudentMgmt.Controller;

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

import com.example.StudentMgmt.Service.StudentService;
import com.example.StudentMgmt.model.Student;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService Stdservice;
	
	@GetMapping("/std")
	public List<Student> getAllStudents()
	{
		System.out.print("inside Controller getallStudents method");
		return Stdservice.getAllStudents();
	}
	
	@GetMapping("/std/{id}")
	public Student getStudentById(@PathVariable long id)
	{
		System.out.print("inside Controller getStudentById method");
		return Stdservice.getStudentById(id);
	}
	
	@PostMapping("/addstd")
	public Student createStudent(@RequestBody Student s)
	{
		System.out.print("inside Controller createStudent method");
		return Stdservice.createStudent(s);
	}
	
	@PutMapping("/putstd/{id}")
	public Student updateStudent(@RequestBody Student s,@PathVariable long id)
	{
		System.out.print("inside Controller updateStudent method");
		return Stdservice.updateStudent(s,id);
	}
	
	@DeleteMapping("/deletestd/{id}")
	public void deleteStudent(@PathVariable long id)
	{
		System.out.print("inside Controller deleteStudent method");
		Stdservice.deleteStudent(id);

	}


}
