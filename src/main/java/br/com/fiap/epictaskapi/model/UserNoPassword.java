package br.com.fiap.epictaskapi.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserNoPassword {

	private Long id;

	@NotBlank
	private String name;
	@Email
	@NotBlank
	private String email;

	public UserNoPassword() {
		super();
	}

	public UserNoPassword(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public UserNoPassword(User user) {
		super();
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}