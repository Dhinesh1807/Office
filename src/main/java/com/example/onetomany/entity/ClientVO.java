package com.example.onetomany.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class ClientVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	public List<ProductVO> getProductVO() {
		return productVO;
	}
	public void setProductVO(List<ProductVO> productVO) {
		this.productVO = productVO;
	}

	private double number;
	private String address;
	private String landmark;
	private String email;
	private long pincode;
	
	@OneToMany(mappedBy = "clientVO",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ProductVO> productVO;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "ClientVO [id=" + id + ", name=" + name + ", number=" + number + ", address=" + address + ", landmark="
				+ landmark + ", email=" + email + ", pincode=" + pincode + ", productVO=" + productVO
				+ ", getProductVO()=" + getProductVO() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getNumber()=" + getNumber() + ", getAddress()=" + getAddress() + ", getLandmark()=" + getLandmark()
				+ ", getEmail()=" + getEmail() + ", getPincode()=" + getPincode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public ClientVO(int id, String name, double number, String address, String landmark, String email, long pincode,
			List<ProductVO> productVO) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
		this.landmark = landmark;
		this.email = email;
		this.pincode = pincode;
		this.productVO = productVO;
	}
	public ClientVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
