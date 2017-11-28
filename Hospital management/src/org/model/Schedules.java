package org.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="User_credentials")


public class Schedules {
	@Id
	@Column(name ="scheduledid")
	private String scheduledid;
	 @ManyToOne
	 @JoinColumn(name = "doc_username")
	 private String doc_username;
	
	@Column(name ="available_days")
	private String available_days;
	public String getDoc_username() {
		return doc_username;
	}
	public void setDoc_username(String doc_username) {
		this.doc_username = doc_username;
	}
	public String getScheduledid() {
		return scheduledid;
	}
	public void setScheduledid(String scheduledid) {
		this.scheduledid = scheduledid;
	}
	public String getAvailable_days() {
		return available_days;
	}
	public void setAvailable_days(String available_days) {
		this.available_days = available_days;
	}

}
