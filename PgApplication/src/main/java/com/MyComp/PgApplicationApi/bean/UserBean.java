package com.MyComp.PgApplicationApi.bean;

import java.sql.Blob;
import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.multipart.MultipartFile;

import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.GenderID;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil.UserType;
/**
 * @author thirukarthi
 *
 */
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
	private String forgotPassword;
	private Date dob;
	private String refreshToken;
	private String accessToken;
	private boolean isVerified;
	private boolean isDeleted;
	private Date createdDate;
	private Date updatedDate;
	private String referenceCode;
	private boolean isEmailSent;
	private Blob profileImage;
	private Blob coverImage;
	private String addressID;
	
	private MultipartFile file;
	
	
	
	
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the userType
	 */
	public UserType getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
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
	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
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
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @return the referenceCode
	 */
	public String getReferenceCode() {
		return referenceCode;
	}
	/**
	 * @param referenceCode the referenceCode to set
	 */
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
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
	/**
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
	
	
	
	
	

	

}
