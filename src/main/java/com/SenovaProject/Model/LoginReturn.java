package com.SenovaProject.Model;

public class LoginReturn {
	int id;
	int accountType;
	String errorMessage;
	public LoginReturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginReturn(int id, int accountType, String errorMessage) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.errorMessage = errorMessage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
