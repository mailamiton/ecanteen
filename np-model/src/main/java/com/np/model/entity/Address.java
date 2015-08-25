package com.np.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.np.model.entity.core.AbstractBaseModel;

@Entity
@Table(name = "m_addrs")
public class Address extends AbstractBaseModel{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
