package com.MyComp.PgApplicationApi.bean;

import java.util.Date;

import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.GenderID;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.UserType;

public class UserBean {

  private int userID;
  private UserType userType;
  private String firstName;
  private String middleName;
  private String lastName;
  private GenderID genderID;
  private String emailID;
  private String phoneNumber;
  private String password;
  private Date dob;
  private Date createdDate;
  private Date updatedDate;

public int getUserID() {
	return userID;
}

public void setUserID(int userID) {
	this.userID = userID;
}

public UserType getUserType() {
	return userType;
}

public void setUserType(UserType userType) {
	this.userType = userType;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}
/**
 * @param middleName the middleName to set
 */
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the genderID
 */
public GenderID getGenderID() {
	return genderID;
}
/**
 * @param genderID the genderID to set
 */
public void setGenderID(GenderID genderID) {
	this.genderID = genderID;
}
/**
 * @return the emailID
 */
public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public Date getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
}


}
