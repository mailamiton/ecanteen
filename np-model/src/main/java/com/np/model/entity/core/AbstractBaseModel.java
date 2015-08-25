package com.np.model.entity.core;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.np.model.entity.User;

public abstract class  AbstractBaseModel implements Serializable{

	private static final long serialVersionUID = -6912339810633466236L;

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

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public User getUseLastUpdId() {
		return useLastUpdId;
	}

	public void setUseLastUpdId(User useLastUpdId) {
		this.useLastUpdId = useLastUpdId;
	}

	public Date getLastUpdDate() {
		return lastUpdDate;
	}

	public void setLastUpdDate(Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
