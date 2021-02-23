package com.joonbread.springmybatis.member.repository;

import java.util.Date;

public class MemberDTO {

	private String userId;
	private String userPw;
	private String userName;
	private String userNick;
	private String userEmail;
	private String userPhone;
	private String userGender;
	private String userRegDate;
	private Date userCreateDate; 
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDTO(String userId, String userPw, String userName, String userNick, String userEmail, String userPhone,
			String userGender, String userRegDate, Date userCreateDate, Date userUpdateDate) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userNick = userNick;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userGender = userGender;
		this.userRegDate = userRegDate;
		this.userCreateDate = userCreateDate;
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
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
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
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	public Date getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	 
}
