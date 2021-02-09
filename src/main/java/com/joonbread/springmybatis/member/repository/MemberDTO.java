package com.joonbread.springmybatis.member.repository;

import java.util.Date;

public class MemberDTO {

	private String userId ; 
	private String userPw ; 
	private String userName ; 
	private String userEmail; 
	private String userPhone; 
	private String userGender; 
	private Date userRegDate;
	private Date userUpdateDate;
	
	public MemberDTO() {
	
	}
	
	

	public MemberDTO(String userId, String userPw, String userName, String userEmail, String userPhone,
			String userGender, Date userRegDate, Date userUpdateDate) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userGender = userGender;
		this.userRegDate = userRegDate;
		this.userUpdateDate = userUpdateDate;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUserRegDate() {
		return userRegDate;
	}

	public void setUserRegDate(Date userRegDate) {
		this.userRegDate = userRegDate;
	}

	public Date getUserUpdateDate() {
		return userUpdateDate;
	}

	public void setUserUpdateDate(Date userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}
	
	
	
	
}
