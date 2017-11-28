package org.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="Patient")


public class Appointments {
	@Id
	@Column(name ="appointmentid")
	private String appointmentid;
	 @ManyToOne
	 @JoinColumn(name = "doc_username")
	private String doc_username;
	 @ManyToOne
	 @JoinColumn(name = "patient_id")
	private String patient_id;
	@Column(name ="appointment_date")
	@Temporal(TemporalType.DATE)
	private String appointment_date;
	@Column(name ="appointment_time")
	private String appointment_time;
	public String getAppointmentid() {
		return appointmentid;
	}
	public void setAppointmentid(String appointmentid) {
		this.appointmentid = appointmentid;
	}
	
	public String getDoc_username() {
		return doc_username;
	}
	public void setDoc_username(String doc_username) {
		this.doc_username = doc_username;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}
	public String getAppointment_time() {
		return appointment_time;
	}
	public void setAppointment_time(String appointment_time) {
		this.appointment_time = appointment_time;
	}
	
	
}
