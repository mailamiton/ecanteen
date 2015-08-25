package com.np.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.np.model.entity.core.AbstractBaseModel;

@Entity
@Table(name = "m_role")
public class Role extends AbstractBaseModel {

	private static final long serialVersionUID = 1L;
		
	@Column(name = "role_name", unique = true, nullable = false, length = 45)
	private String roleName;
	
	@Column(name = "role_desc", nullable = false, length = 45)
	private String roleDesc;
	
	
	public Role() {
	}
 
			
}
