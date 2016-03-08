package org.tht.mongodb.mongodb;

public class Employee {

	 private String id;
	
	 private Integer empid; 
	
	 private String firstname;
	 
	 private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Employee() {
		super();
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	 
	 
}
