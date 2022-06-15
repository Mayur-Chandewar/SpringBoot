package org.institute.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="inquiry_student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	@Column(length=40)
	private String name; 
	@Column(length=10,nullable = false,unique = true)
	private String contact; 
	@Column(length=70,nullable = false,unique = true)
	private String email; 
	@Column(length=40)
	private String city;
	@Column(length=40)
	private String highQulification;
	private int passingYear; 
	@Column(length=80)
	private String inqFor;
	@Temporal(TemporalType.DATE)
	private Date inqDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHighQulification() {
		return highQulification;
	}
	public void setHighQulification(String highQulification) {
		this.highQulification = highQulification;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	public String getInqFor() {
		return inqFor;
	}
	public void setInqFor(String inqFor) {
		this.inqFor = inqFor;
	}
	public Date getInqDate() {
		return inqDate;
	}
	public void setInqDate(Date inqDate) {
		this.inqDate = inqDate;
	}
	
	
}
