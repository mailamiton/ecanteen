package com.np.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.np.model.entity.core.AbstractBaseModel;

@Entity
@Table(name = "m_user_detail")
public class UserDetail  extends AbstractBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
