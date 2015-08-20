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

@Entity
@Table(name = "m_user_detail")
public class UserDetail {

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
	
	@JoinColumn(name="user_id")
	@OneToOne(fetch=FetchType.LAZY)
	private User userId;
	
	@Column(name = "first_name", unique = false, nullable = false, length = 45)
	private String firstName;
	
	@Column(name = "middle_name", unique = false, nullable = false, length = 45)
	private String middleName;
	
	@Column(name = "last_name", unique = false, nullable = false, length = 45)
	private String lastName;
	
	@Column(name = "date_of_birth", unique = false, nullable = false, length = 45)
	private Date dob;
	
	@Column(name = "email", unique = false, nullable = false, length = 45)
	private String email;
	
	@Column(name = "phone_one", unique = false, nullable = false, length = 45)
	private String phoneOne;
	
	@Column(name = "phone_two", unique = false, nullable = false, length = 45)
	private String phoneTwo;
	
}
