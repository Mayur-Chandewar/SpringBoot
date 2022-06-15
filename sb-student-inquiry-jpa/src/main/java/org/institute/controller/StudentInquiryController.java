package org.institute.controller;

import java.util.List;

import org.institute.entity.Student;
import org.institute.repository.StudentInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInquiryController {

	@Autowired
	private StudentInquiryRepository repository;
	
	//Save Student Inquiry
	@PostMapping("/student/save")
	public Student saveStudentInquiry(@RequestBody Student student) {
		Student st= repository.save(student);
		return st;
	}
	
	//get all data of Student
	@GetMapping("/student/get-all")
	public List<Student> getAllContact(){
		return repository.findAll();
	}
	
	//Delete Student inquiry by Id
	@DeleteMapping("/student/delete-by-id")
	public String seleteInquiryById(@RequestParam("id") int id) {
		repository.deleteById(id);
		return "Inquiry Deleted Successfully";
	}
	
	//inquiry get by City
	@GetMapping("/student/get-inquiry-by-city")
	public List<Student> getInquiryByCity(@RequestParam("city") String c){
		return repository.getInquiryByCity(c);
	}
	
	//inquiry get by inqFor
	@GetMapping("/student/get-inquiry-For")
	public List<Student> getInquiryFor(@RequestParam("inqFor") String inq){
		return repository.getInquiryFor(inq);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
