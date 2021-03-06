package com.institute.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.bean.StudentBean;
import com.institute.repository.StudentInquiryRepository;

@RestController
public class StudentInquiryController {
	
	@Autowired
	StudentInquiryRepository repository;

	//Save Student Inquiry
	// localhost:8080/student/inquiry/save
	@PostMapping("/student/inquiry/save")
	public String saveStudentInquiry( @RequestBody StudentBean bean) {
		int result = repository.saveStudentInquiry(bean);
		return (result>0)?"Student Inquiry Saved Successfully":"Student Inquiry Fail to Save... plz try again ";
	}
	
	//2.	Get all the inquires
	//localhost:8080/student/inquiry/get-all
	@GetMapping("/student/inquiry/get-all")
	public List getAllInquiry() {
		return repository.getAllInquiry();
	}
	//3.	Delete The Inquiry by ID
	//localhost:8080/student/inquiry/delete-by-id
	@DeleteMapping("/student/inquiry/delete-by-id")
	public String deleteStudentInquiryById(@RequestParam("id") int id) {
		int result = repository.deleteStudentInquiryById(id);
		
		return (result>0)?"Student Inquiry Deleted Successfully":"Student Inquiry Fail to Deletion... plz try again ";
		
	}
	
	//4.	Get Inquires by City 
	//localhost:8080/student/inquiry/by-city
	@GetMapping("/student/inquiry/by-city")
	public List getStudentInquiryByCity(@RequestParam("city") String city) {
		List result= repository.getStudentInquiryByCity(city);
		return result;
	}
	
	
	//5.	Get Inquires by inqFor
	
	//localhost:8080/student/inquiry/by-inqfor
		@GetMapping("/student/inquiry/by-inqfor")
		public List getStudentInquiryByInqFor(@RequestParam("inqfor") String inqfor) {
			List result= repository.getStudentInquiryByInqFor(inqfor);
			return result;
		}
	
	
	
}
