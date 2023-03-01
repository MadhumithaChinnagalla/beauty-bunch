package com.example.beautybunch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long P_id;
private String P_Name;
private String quantity;
private long price;
public long getP_id() {
	return P_id;
}
public void setP_id(long p_id) {
	P_id = p_id;
}
public String getP_Name() {
	return P_Name;
}
public void setP_Name(String p_Name) {
	P_Name = p_Name;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public Product(long p_id, String p_Name, String quantity, long price) {
	super();
	P_id = p_id;
	P_Name = p_Name;
	this.quantity = quantity;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [P_id=" + P_id + ", P_Name=" + P_Name + ", quantity=" + quantity + ", price=" + price + "]";
}

}
