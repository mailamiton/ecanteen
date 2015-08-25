package com.np.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.np.model.entity.core.AbstractBaseModel;

@Entity
@Table(name = "m_user_role")
public class UserRole  extends AbstractBaseModel{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User userId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Role role;
		
}
