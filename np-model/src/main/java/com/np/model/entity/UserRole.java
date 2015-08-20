package com.np.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_user_role")
public class UserRole {

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
		
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User userId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Role role;
		
}
