package com.example.onetomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="productdetail")
public class ProductVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pname;
	private int price;
	private int quantity;
	
	public ProductVO() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public ProductVO(int id, String pname, int price, int quantity) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	@ManyToOne
	@JoinColumn(name ="client_id")
	@JsonBackReference
	private ClientVO clientVO;
}
