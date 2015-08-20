package com.np.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_addrs")
public class Address implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private long Id;
	
	@Column(name = "created_by", nullable = false, length = 45)
	private String createdBy; 
	
	@Column(name = "created_dt",  nullable = false, length = 45)
	private Date createdDt; 
		
	@Column(name = "last_upd_by",  nullable = false, length = 45)
	private String lastUpdBy; 
	
	@Column(name = "last_upd_dt",  nullable = false, length = 45)
	private Date lastUpdDate; 
	
	@Column(name = "enabled", nullable = true)
	private boolean enabled;
		
	@Column(name = "line1", nullable = true, length = 45)
	private String addressLine1;
	
	@Column(name = "line2", nullable = true, length = 45)
	private String addressLine2;
	
	@Column(name = "landmark", nullable = true, length = 45)
	private String addressLandmark;
	
	@Column(name = "state", nullable = true, length = 45)
	private String state;
	
	@Column(name = "pincode", nullable = true, length = 45)
	private String pincode;
	
	@Column(name = "verified", nullable = true, length = 45)
	private boolean verified;
	
	@Column(name = "verified_by", nullable = true, length = 45)
	private User userId;
	
}
