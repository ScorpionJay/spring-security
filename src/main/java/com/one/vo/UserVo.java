package com.one.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jay
 * @since 2016年6月7日
 */
public class UserVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String username;
	private String password;
	private String email;
	private Date lastPasswordReset;
	private String authorities;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getLastPasswordReset() {
		return lastPasswordReset;
	}

	public void setLastPasswordReset(Date lastPasswordReset) {
		this.lastPasswordReset = lastPasswordReset;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public UserVo() {
	}

	public UserVo(String id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserVo [id=" + id + ", userName=" + username + ", password=" + password + ", email=" + email + "]";
	}

	public UserVo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserVo(String username, String password, String authorities) {
		super();
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	
	
	
}
