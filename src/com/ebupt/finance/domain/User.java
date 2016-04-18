package com.ebupt.finance.domain;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="username" , length=30)
	private String username;
	@Column(name="password" , length=30)
	private String password;
	@Column(name="nickname" , length=30)
	private String nickname;
	@Column(name="email" , length=30)
	private String email;
	@Column(name="phone" , length=30)
	private String phone;
	@Column(name="qq" , length=30)
	private String qq;
	@Column(name="avatar" , length=11)
	private String avatar;
	@Column(name="id_number" , length=30)
	private String id_number;
	@Column(name="id_photo" , length=11)
	private String id_photo;
	@Column(name="status" , length=3)
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getId_photo() {
		return id_photo;
	}
	public void setId_photo(String id_photo) {
		this.id_photo = id_photo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
}
