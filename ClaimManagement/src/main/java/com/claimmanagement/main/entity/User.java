package com.claimmanagement.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name = "USER_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@Size(max = 20)
	@NotBlank
	@Pattern(regexp = "^[A-Za-z_][A-Za-z\\d_]*$", message = "Must be alphabets and numbers only!")
	private String userName;
	@Size(max = 50)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z][a-zA-Z ]+[a-zA-Z]$", message = "Must be alphabets only!")
	private String name;
	@Email(message = "must be valid email eg.abc@defg.com")
	private String email;
	@Size(max = 10)
	@NotBlank
	@Pattern(regexp = "/^([+]\\d{2}[ ])?\\d{10}$/", message = "Must be numbers only!")
	private String mobile;
	@NotBlank
	@Pattern(regexp = "/^[ A-Za-z0-9_@./#&+-]*$/", message = "Must be alphabets, numbers and special characters only!")
	private String address;
	@NotBlank
	private String profile_photo;
	@Size(max = 25)
	@NotBlank
	@Pattern(regexp = "^[ A-Za-z0-9_@-]*$", message = "Must be alphabets, numbers and special characters only!")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfile_photo() {
		return profile_photo;
	}
	public void setProfile_photo(String profile_photo) {
		this.profile_photo = profile_photo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(
			@Size(max = 20) @NotBlank @Pattern(regexp = "^[A-Za-z_][A-Za-z\\d_]*$", message = "Must be alphabets and numbers only!") String userName,
			@Size(max = 50) @NotBlank @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+[a-zA-Z]$", message = "Must be alphabets only!") String name,
			@Email(message = "must be valid email eg.abc@defg.com") String email,
			@Size(max = 10) @NotBlank @Pattern(regexp = "/^([+]\\d{2}[ ])?\\d{10}$/", message = "Must be numbers only!") String mobile,
			@NotBlank @Pattern(regexp = "/^[ A-Za-z0-9_@./#&+-]*$/", message = "Must be alphabets, numbers and special characters only!") String address,
			@NotBlank String profile_photo,
			@Size(max = 25) @NotBlank @Pattern(regexp = "^(?=.*[\\d])(?=.*[A-Z])(?=.*[a-z])[\\w\\d!@#$%_]{6,40}$", message = "Must be alphabets, numbers and special characters only!") String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.profile_photo = profile_photo;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", profile_photo=" + profile_photo + ", password=" + password + "]";
	}
	

}
