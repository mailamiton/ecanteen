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
@Table(name = "m_role")
public class Role implements Serializable{

	
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
		
	@Column(name = "role_name", unique = true, nullable = false, length = 45)
	private String roleName;
	
	@Column(name = "role_desc", nullable = false, length = 45)
	private String roleDesc;
	
	
	public Role() {
	}
 
			
}
