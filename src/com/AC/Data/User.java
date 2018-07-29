package com.AC.Data;

import java.awt.List;
import java.util.ArrayList;

public class User {

	private String username;
	
	private String pwd;
	
	private String result;
		
	private boolean Issuccess;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isIssuccess() {
		return Issuccess;
	}

	public void setIssuccess(boolean issuccess) {
		Issuccess = issuccess;
	}
	
	public boolean getIssuccess() {
		return Issuccess;
	}
	
	
	static public ArrayList<User> userlist=new ArrayList<User>();
	
}

