package com.institute.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.institute.bean.StudentBean;

@Repository
public class StudentInquiryRepository {

	@Autowired
	JdbcTemplate template;

	//Save Student Inquiry
	public int saveStudentInquiry(StudentBean bean) {
		String query= "insert studentinquiry values(0,?,?,?,?,?,?,?,?)";
		LocalDate date = LocalDate.now();
		Object data[]= {bean.getName(),bean.getContact(),bean.getEmail(),bean.getCity(),bean.getHighQulification(),bean.getPassingYear(),bean.getInqFor(),date};
		int count = template.update(query,data);
		return count;
	}

	//View All Student Inquiry
	public List getAllInquiry() {
		String query= "select * from studentinquiry";
		List records = template.queryForList(query);
		return records;
	}

	//Get Inquires by City 
	public List getStudentInquiryByCity(String city) {
		String query="select * from studentinquiry where city=?";
		
		List records = template.queryForList(query, city);
		return records;
	}

	//Get Inquires by inqFor
	public List getStudentInquiryByInqFor(String inqfor) {
		String query="select * from studentinquiry where inqFor=?";
		
		List records = template.queryForList(query, inqfor);
		return records;
	}

	//delete Inquires by id
	public int deleteStudentInquiryById(int id) {
		String query = "delete from studentinquiry where id=?";
		int count = template.update(query,id);
		
		return count;
	}
	
	
	
	
}
