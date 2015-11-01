package com.np.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.np.model.entity.core.AbstractBaseModel;

@Entity
@Table(name = "m_user")
public class User extends AbstractBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5595439064351790339L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private long Id;
		
	@Column(name = "username", unique = true, nullable = false, length = 45)
	private  String userName;
	
	@Column(name = "password", nullable = false, length = 30)
	private  String password;
	
	@Column(name = "password_hint", nullable = true, length = 30)
	private  String passwordHint;
	
	public User() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordHint() {
		return passwordHint;
	}

	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
