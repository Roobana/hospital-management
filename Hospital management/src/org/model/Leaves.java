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
@Table (name="Leaves")


public class Leaves {
	@Id
	@Column(name ="leaveid")
	private String leaveid;
	 @ManyToOne
	 @JoinColumn(name = "doc_username")
	 private String doc_username;
	@Column(name ="leavename")
	private String leavename;
	@Column(name ="leave_fromdate")
	@Temporal(TemporalType.DATE)
	private String leave_fromdate;
	@Column(name ="leave_to")
	@Temporal(TemporalType.DATE)
	private String leave_to;
	@Column(name ="reason")
	private String reason;
	public String getLeaveid() {
		return leaveid;
	}
	public void setLeaveid(String leaveid) {
		this.leaveid = leaveid;
	}
	public String getLeavename() {
		return leavename;
	}
	public void setLeavename(String leavename) {
		this.leavename = leavename;
	}
	public String getLeave_fromdate() {
		return leave_fromdate;
	}
	public void setLeave_fromdate(String leave_fromdate) {
		this.leave_fromdate = leave_fromdate;
	}
	public String getLeave_to() {
		return leave_to;
	}
	public void setLeave_to(String leave_to) {
		this.leave_to = leave_to;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	

}
