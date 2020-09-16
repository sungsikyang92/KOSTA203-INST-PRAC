package org.study.model;

public class AdminVO {
	private String id;
	private String password;
	private String name;
	private String department;
	public AdminVO() {
		super();
	}
	
	public AdminVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public AdminVO(String id, String password, String name, String department) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "AdminVO [id=" + id + ", password=" + password + ", name=" + name + ", department=" + department + "]";
	}
	
}
