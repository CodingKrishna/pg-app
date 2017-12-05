package com.MyComp.PgApplicationApi.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.GenderID;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.LoginType;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.UserType;

@Entity
@Table(name = "user")
@DynamicUpdate
public class User implements Serializable {
  private static final long serialVersionUID = -723583058586873479L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  @Column(name = "userID")
  private int userID;

  @Column(name = "userType")
  private UserType userType;

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "middleName")
  private String middleName;

  @Column(name = "lastName")
  private String lastName;

  @Column(name = "genderID")
  private GenderID genderID;

  @Column(name = "loginType")
  private LoginType loginType;

  @Column(name = "emailID")
  private String emailID;

  @Column(name = "phoneNumber")
  private String phoneNumber;

  @Column(name = "password")
  private String password;

  @Column(name = "dob")
  private Date dob;
  
  @Column(name = "createdDate")
  private Date createdDate;

  @Column(name = "updatedDate")
  private Date updatedDate;
  
  @Column(name = "forgotPassword")
	private String forgotPassword;
  
  
  @Column(name = "refreshToken")
	private String refreshToken;
	
	@Column(name = "accessToken")
	private String accessToken;
	
	@Column(name = "isVerified", nullable = false, columnDefinition = "BIT",length = 1)
	private boolean isVerified;
	
	@Column(name = "isDeleted", nullable = false, columnDefinition = "BIT",length = 1)
	private boolean isDeleted;
  
	@Column(name = "isEmailSent", nullable = false, columnDefinition = "BIT",length = 1)
	private boolean isEmailSent;
	
	@Column(name = "authenticationToken")
	private String authenticationToken;
	
	@Column(name = "profileImage")
    @Lob
    private Blob profileImage;
	//private byte[] profileImage;
	
	@Column(name = "coverImage")
    @Lob
    private Blob coverImage;
	//private byte[] profileImage;
	
	@Column(name = "addressID")
	private String addressID;
	
	
	

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

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public GenderID getGenderID() {
    return genderID;
  }

  public void setGenderID(GenderID genderID) {
    this.genderID = genderID;
  }

  public LoginType getLoginType() {
    return loginType;
  }

  public void setLoginType(LoginType loginType) {
    this.loginType = loginType;
  }

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

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

/**
 * @return the forgotPassword
 */
public String getForgotPassword() {
	return forgotPassword;
}

/**
 * @param forgotPassword the forgotPassword to set
 */
public void setForgotPassword(String forgotPassword) {
	this.forgotPassword = forgotPassword;
}

/**
 * @return the refreshToken
 */
public String getRefreshToken() {
	return refreshToken;
}

/**
 * @param refreshToken the refreshToken to set
 */
public void setRefreshToken(String refreshToken) {
	this.refreshToken = refreshToken;
}

/**
 * @return the accessToken
 */
public String getAccessToken() {
	return accessToken;
}

/**
 * @param accessToken the accessToken to set
 */
public void setAccessToken(String accessToken) {
	this.accessToken = accessToken;
}

/**
 * @return the isVerified
 */
public boolean isVerified() {
	return isVerified;
}

/**
 * @param isVerified the isVerified to set
 */
public void setVerified(boolean isVerified) {
	this.isVerified = isVerified;
}

/**
 * @return the isDeleted
 */
public boolean isDeleted() {
	return isDeleted;
}

/**
 * @param isDeleted the isDeleted to set
 */
public void setDeleted(boolean isDeleted) {
	this.isDeleted = isDeleted;
}

/**
 * @return the isEmailSent
 */
public boolean isEmailSent() {
	return isEmailSent;
}

/**
 * @param isEmailSent the isEmailSent to set
 */
public void setEmailSent(boolean isEmailSent) {
	this.isEmailSent = isEmailSent;
}

/**
 * @return the authenticationToken
 */
public String getAuthenticationToken() {
	return authenticationToken;
}

/**
 * @param authenticationToken the authenticationToken to set
 */
public void setAuthenticationToken(String authenticationToken) {
	this.authenticationToken = authenticationToken;
}

/**
 * @return the profileImage
 */
public Blob getProfileImage() {
	return profileImage;
}

/**
 * @param profileImage the profileImage to set
 */
public void setProfileImage(Blob profileImage) {
	this.profileImage = profileImage;
}

/**
 * @return the coverImage
 */
public Blob getCoverImage() {
	return coverImage;
}

/**
 * @param coverImage the coverImage to set
 */
public void setCoverImage(Blob coverImage) {
	this.coverImage = coverImage;
}

/**
 * @return the addressID
 */
public String getAddressID() {
	return addressID;
}

/**
 * @param addressID the addressID to set
 */
public void setAddressID(String addressID) {
	this.addressID = addressID;
}

  
  
  
  
}
