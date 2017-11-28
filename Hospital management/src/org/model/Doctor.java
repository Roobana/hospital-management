package org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="Doctor")
public class Doctor {
	@Id
	@Column(name ="doc_username")
	private String doc_username;
	@Column(name ="doctorname")
	private String doctorname;
	@Column(name ="dob")
	@Temporal(TemporalType.DATE)
	private String dob;
	@Column(name ="gender")
	private String gender;
	@Column(name ="qualification")
	private String qualification;
	@Column(name ="specilication")
	private String specilication;
	@Column(name ="year_of_experience")
	@Temporal(TemporalType.DATE)
	private Integer year_of_experience;
	@Column(name ="street")
	private String street;
	@Column(name ="location")
	private String location;
	@Column(name ="city")
	private String city;
	@Column(name ="state")
	private String state;
	@Column(name ="pincode")
	private String pincode;
	@Column(name ="contact_number")
	private String contact_number;
	@Column(name ="emailid")
	private String emailid;
	public String getDoc_username() {
		return doc_username;
	}
	public void setDoc_username(String doc_username) {
		this.doc_username = doc_username;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecilication() {
		return specilication;
	}
	public void setSpecilication(String specilication) {
		this.specilication = specilication;
	}
	public Integer getYear_of_experience() {
		return year_of_experience;
	}
	public void setYear_of_experience(Integer year_of_experience) {
		this.year_of_experience = year_of_experience;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

}
