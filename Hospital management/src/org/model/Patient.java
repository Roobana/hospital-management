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


public class Patient{
	@Id
	@Column(name ="patientid")
	private String patientid;
	 @ManyToOne
	 @JoinColumn(name = "username")
	private String username;
	@Column(name ="appointment_date")
	@Temporal(TemporalType.DATE)
	private String appointment_date;
	@Column(name ="patient_detail")
	private String patient_detail;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name ="diagnoses_history")
	private String diagnoses_history;
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	
	public String getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}
	public String getPatient_detail() {
		return patient_detail;
	}
	public void setPatient_detail(String patient_detail) {
		this.patient_detail = patient_detail;
	}
	public String getDiagnoses_history() {
		return diagnoses_history;
	}
	public void setDiagnoses_history(String diagnoses_history) {
		this.diagnoses_history = diagnoses_history;
	}


}
