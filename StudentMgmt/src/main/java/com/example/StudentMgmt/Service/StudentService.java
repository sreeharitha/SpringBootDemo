package com.example.StudentMgmt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMgmt.Repository.StudentRepository;
import com.example.StudentMgmt.model.Student;

@Service
public class StudentService {

@Autowired
private StudentRepository stdrepo;
	
	public List<Student> getAllStudents()
	{
		System.out.print("inside service getallStudents method");
		return stdrepo.findAll();
	}
	
	public Student getStudentById(Long id)
	{
		System.out.print("inside service getStudentById method");
		return stdrepo.findById(id).orElseThrow(() -> new StdException(id));
	}
	
	public Student createStudent(Student s)
	{
		System.out.print("inside service createStudent method");
		return stdrepo.save(s);
	}
	
	public Student updateStudent(Student s,Long id)
	{
		System.out.print("inside service updateStudent method");
		Student s1=stdrepo.findById(id).orElseThrow(()-> new StdException(id));
		
		s1.setStdname(s.getStdname());
	    s1.setSchool(s.getSchool());
	    s1.setEmail(s.getEmail());
		
		return stdrepo.save(s1);
	}
	
	public void deleteStudent(Long id)
	{
		System.out.print("inside service deleteStudent method");
		Student s=stdrepo.findById(id).orElseThrow(()-> new StdException(id));
		stdrepo.delete(s);
	}

}
