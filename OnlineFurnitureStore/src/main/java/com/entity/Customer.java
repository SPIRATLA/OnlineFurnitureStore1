package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="customer")
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	@Column(name="fullname")
	@NotEmpty
	@Size(min=3, message="student fullname should have atleast 3 char")
	private String fullName;
	
	private String contactNo;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="login")
	private Login login;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fullName=" + fullName + ", contactNo=" + contactNo + ", login=" + login
				+ ", address=" + address + "]";
	}
	
	

	
}
