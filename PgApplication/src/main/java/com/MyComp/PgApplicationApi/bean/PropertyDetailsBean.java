package com.MyComp.PgApplicationApi.bean;

import java.sql.Blob;

import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.PropertyInfo;

public class PropertyDetailsBean {
	
	
	private int propertyID;
	private String userID;
	private PropertyInfo propertyInfo; 
	private String propertyDescription;
	private Blob propertyImage;
	
	
	/**
	 * @return the propertyID
	 */
	public int getPropertyID() {
		return propertyID;
	}
	/**
	 * @param propertyID the propertyID to set
	 */
	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	/**
	 * @return the propertyInfo
	 */
	public PropertyInfo getPropertyInfo() {
		return propertyInfo;
	}
	/**
	 * @param propertyInfo the propertyInfo to set
	 */
	public void setPropertyInfo(PropertyInfo propertyInfo) {
		this.propertyInfo = propertyInfo;
	}
	/**
	 * @return the propertyDescription
	 */
	public String getPropertyDescription() {
		return propertyDescription;
	}
	/**
	 * @param propertyDescription the propertyDescription to set
	 */
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}
	/**
	 * @return the propertyImage
	 */
	public Blob getPropertyImage() {
		return propertyImage;
	}
	/**
	 * @param propertyImage the propertyImage to set
	 */
	public void setPropertyImage(Blob propertyImage) {
		this.propertyImage = propertyImage;
	}
	
	
	

}
