package org.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="User_credentials")


public class User_credentials {
	 @ManyToOne
	 @JoinColumn(name = "username")
	private String username;
	@Id
	@Column(name ="password")
	private String password;
	@Column(name ="usertype")
	private String usertype;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
}
