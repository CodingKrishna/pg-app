package com.MyComp.PgApplicationApi.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.PropertyInfo;

@Entity
@Table(name = "propertyDetails")
@DynamicUpdate
public class PropertyDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3683823206254705381L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "propertyID")
	private int propertyID;
	
	@Column(name = "userID")
	private String userID;
	
	@Column(name = "propertyInfo")
	private PropertyInfo propertyInfo;
	
	@Column(name = "propertyDescription")
	private String propertyDescription;
	
	@Column(name = "propertyImage")
	@Lob
	private Blob propertyImage;
	
	
	
	

}
