package com.acedeveloper.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class UserDetailsRequestModel {
	@NotNull(message="First name cannot be empty")
	@Size(min=2,message="First Name must not be less than 2chars")
	private String firstName;
	@NotNull(message="Last name cannot be empty")
	@Size(min=2,message="First Name must not be less than 2chars")
	private String lastName;
	@NotNull(message="email cxannot be empty")
	@Email
	private String email;
	@NotNull(message="password cannot be empty")
	@Size(min=8,max=16,message="Password greater than 8chars and lessthan 16chars")
	private String password;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
