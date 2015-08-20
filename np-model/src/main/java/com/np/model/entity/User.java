package com.np.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5595439064351790339L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private long Id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "created_by")
	private User userId; 
	
	@Column(name = "created_dt",  nullable = false )
	@Temporal(TemporalType.DATE)
	private Date createdDt; 
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "last_upd_by", nullable = true)
	private User useLastUpdId; 
	
	@Column(name = "last_upd_dt",  nullable = false, length = 45)
	private Date lastUpdDate; 
	
	@Column(name = "enabled", nullable = true)
	private boolean enabled;
		
	@Column(name = "username", unique = true, nullable = false, length = 45)
	private  String userName;
	
	@Column(name = "password", nullable = false, length = 30)
	private  String password;
	
	@Column(name = "password_hint", nullable = true, length = 30)
	private  String passwordHint;
	
	public User() {
	}
 
	public User(final String username, final String password, boolean enabled) {
		this.userName = username;
		this.password = password;
		this.enabled = enabled;
	}

	public long getId() {
		return Id;
	}

	public void setId(final long id) {
		Id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(final User userId) {
		this.userId = userId;
	}

	public Date getCreatedDt() {
		return (this.createdDt == null) ? new Date() : createdDt;
	}

	public void setCreatedDt(final Date createdDt) {
		this.createdDt = createdDt;
	}

	public User getUseLastUpdId() {
		return useLastUpdId;
	}

	public void setUseLastUpdId(final User useLastUpdId) {
		this.useLastUpdId = useLastUpdId;
	}

	public Date getLastUpdDate() {
		return lastUpdDate;
	}

	public void setLastUpdDate(final Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}

	public final String getUserName() {
		return userName;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}

	public final String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public final String getPasswordHint() {
		return passwordHint;
	}

	public void setPasswordHint(final String passwordHint) {
		this.passwordHint = passwordHint;
	}
		
}
